package frc.team4373.swerve;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Represents a swerve wheel with two motors.
 */
class SwerveWheel {
    private final SwerveDrivetrain.WheelID wheelID;
    private final double maxWheelSpeed;

    private WPI_TalonSRX driveMotor;
    private WPI_TalonSRX rotatorMotor;

    private boolean isInverted = false;

    private double maxAcceleration = 2;

    private double lastSetSpeed = 0;

    /**
     * Constructs a new swerve wheel for the specified wheel.
     * @param driveMotorConfig the config for the drive motor.
     * @param rotatorMotorConfig the config for the rotator motor.
     * @param currentLimitConfig the current limiting configuration.
     * @param maxWheelSpeed the max wheel speed, in native units.
     */
    SwerveWheel(SwerveDrivetrain.WheelID wheelID,
                SwerveConfig.MotorConfig driveMotorConfig,
                SwerveConfig.MotorConfig rotatorMotorConfig,
                double maxWheelSpeed, SwerveConfig.CurrentLimitConfig currentLimitConfig) {
        this.wheelID = wheelID;
        this.maxWheelSpeed = maxWheelSpeed;

        this.driveMotor = new WPI_TalonSRX(driveMotorConfig.id);
        this.rotatorMotor = new WPI_TalonSRX(rotatorMotorConfig.id);

        if (currentLimitConfig.driveMotorLimitingEnabled) {
            this.driveMotor.configPeakCurrentLimit(
                    currentLimitConfig.driveMotorPeakAmperage,
                    SwerveConstants.TALON_TIMEOUT_MS);
            this.driveMotor.configPeakCurrentDuration(
                    currentLimitConfig.driveMotorPeakDuration,
                    SwerveConstants.TALON_TIMEOUT_MS);
            this.driveMotor.configContinuousCurrentLimit(
                    currentLimitConfig.driveMotorContinuousAmperage,
                    SwerveConstants.TALON_TIMEOUT_MS);
        }
        this.driveMotor.enableCurrentLimit(currentLimitConfig.driveMotorLimitingEnabled);
        if (currentLimitConfig.rotatorMotorLimitingEnabled) {
            this.rotatorMotor.configPeakCurrentLimit(
                    currentLimitConfig.rotatorMotorPeakAmperage,
                    SwerveConstants.TALON_TIMEOUT_MS);
            this.rotatorMotor.configPeakCurrentDuration(
                    currentLimitConfig.rotatorMotorPeakDuration,
                    SwerveConstants.TALON_TIMEOUT_MS);
            this.rotatorMotor.configContinuousCurrentLimit(
                    currentLimitConfig.rotatorMotorContinuousAmperage,
                    SwerveConstants.TALON_TIMEOUT_MS);
        }
        this.rotatorMotor.enableCurrentLimit(currentLimitConfig.rotatorMotorLimitingEnabled);

        this.driveMotor.setInverted(driveMotorConfig.inverted);
        this.rotatorMotor.setInverted(rotatorMotorConfig.inverted);

        this.driveMotor.setNeutralMode(driveMotorConfig.neutralMode);
        this.rotatorMotor.setNeutralMode(rotatorMotorConfig.neutralMode);

        this.driveMotor.setSensorPhase(driveMotorConfig.encoderPhase);
        this.rotatorMotor.setSensorPhase(rotatorMotorConfig.encoderPhase);

        this.driveMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
        this.rotatorMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
        this.rotatorMotor.configFeedbackNotContinuous(false, SwerveConstants.TALON_TIMEOUT_MS);

        this.driveMotor.config_kF(SwerveConstants.PID_IDX, driveMotorConfig.gains.kF);
        this.driveMotor.config_kP(SwerveConstants.PID_IDX, driveMotorConfig.gains.kP);
        this.driveMotor.config_kI(SwerveConstants.PID_IDX, driveMotorConfig.gains.kI);
        this.driveMotor.config_kD(SwerveConstants.PID_IDX, driveMotorConfig.gains.kD);

        this.rotatorMotor.config_kF(SwerveConstants.PID_IDX, rotatorMotorConfig.gains.kF);
        this.rotatorMotor.config_kP(SwerveConstants.PID_IDX, rotatorMotorConfig.gains.kP);
        this.rotatorMotor.config_kI(SwerveConstants.PID_IDX, rotatorMotorConfig.gains.kI);
        this.rotatorMotor.config_kD(SwerveConstants.PID_IDX, rotatorMotorConfig.gains.kD);
    }

    /**
     * Sets the swerve wheel's two motors' PID loops.
     * @param heading the heading, in degrees, at which to angle the wheel.
     * @param speed the percent of maximum speed at which to drive.
     */
    void set(double speed, double heading) {

        double acceleration = speed - lastSetSpeed;

        if (acceleration > maxAcceleration) {
            speed = lastSetSpeed + maxAcceleration;
        } else if (acceleration < -maxAcceleration) {
            speed = lastSetSpeed - maxAcceleration;
        }

        lastSetSpeed = speed;

        heading *= SwerveConstants.DEGREES_TO_ENCODER_UNITS;

        double currentRotation = rotatorMotor.getSelectedSensorPosition();
        double rotationError = Math.IEEEremainder(heading - currentRotation,
                SwerveConstants.WHEEL_ENCODER_TICKS);

        SmartDashboard.putNumber("swerve/" + this.wheelID.name() + "/Pre-Inv Rot", rotationError);

        // minimize azimuth rotation, reversing drive if necessary
        isInverted = Math.abs(rotationError) > 0.25 * SwerveConstants.WHEEL_ENCODER_TICKS;
        if (isInverted) {
            rotationError -= Math.copySign(0.5 * SwerveConstants.WHEEL_ENCODER_TICKS,
                    rotationError);
            speed = -speed;
        }

        SmartDashboard.putNumber("swerve/" + this.wheelID.name() + "/Rot Offset", rotationError);
        SmartDashboard.putNumber("swerve/" + this.wheelID.name() + "/Rot Setpt",
                currentRotation + rotationError);
        SmartDashboard.putNumber("swerve/" + this.wheelID.name() + "/Speed",
                speed * this.maxWheelSpeed);

        this.rotatorMotor.set(ControlMode.Position, currentRotation + rotationError);
        if (speed == 0) {
            this.driveMotor.stopMotor();
        } else {
            this.driveMotor.set(ControlMode.Velocity, speed * this.maxWheelSpeed);
        }
    }

    /**
     * Sets drive and rotator PID gains.
     * @param drivePID a {@link SwerveConfig.PID} object with new parameters for the drive PID,
     *                 or null to leave unchanged.
     * @param rotatorPID a {@link SwerveConfig.PID} object with parameters for rotational PID,
     *                   or null to leave unchanged.
     */
    void setPID(SwerveConfig.PID drivePID, SwerveConfig.PID rotatorPID) {
        if (drivePID != null) {
            setDrivePID(drivePID);
        }
        if (rotatorPID != null) {
            setRotatorPID(rotatorPID);
        }
    }

    /**
     * Sets the PID gains for the rotator motor.
     * @param pid the new PID gains.
     */
    private void setRotatorPID(SwerveConfig.PID pid) {
        this.rotatorMotor.config_kP(0, pid.kP);
        this.rotatorMotor.config_kI(0, pid.kI);
        this.rotatorMotor.config_kD(0, pid.kD);
        this.rotatorMotor.config_kF(0, pid.kF);
    }

    /**
     * Sets the PID gains for the drive motor.
     * @param pid the new PID gains.
     */
    private void setDrivePID(SwerveConfig.PID pid) {
        this.driveMotor.config_kP(0, pid.kP);
        this.driveMotor.config_kI(0, pid.kI);
        this.driveMotor.config_kD(0, pid.kD);
        this.driveMotor.config_kF(0, pid.kF);
    }

    /**
     * Sets the wheel's motors in percent output (non-closed-loop, non PID) mode.
     * @param drivePower the percent of maximum output to set the drive motor to (not limited).
     * @param rotatorPower the percent of maximum output to set the rotator motor to (not limited).
     */
    void setPercentOutput(double drivePower, double rotatorPower) {
        this.driveMotor.set(ControlMode.PercentOutput, drivePower);
        this.rotatorMotor.set(ControlMode.PercentOutput, rotatorPower);
    }

    /**
     * Stops all motors.
     */
    void stop() {
        this.driveMotor.stopMotor();
        this.rotatorMotor.stopMotor();
    }

    /**
     * Gets the percent output of the drive motor.
     * @return the percent output, [-1, 1].
     */
    double drivePercentOutput() {
        return this.driveMotor.getMotorOutputPercent();
    }

    /**
     * Reduces (for the duration of the power cycle) the rotator motor's encoder's position
     * modulo the number of ticks in a full revolution.
     */
    void modularizeAbsoluteEncoder() {
        this.rotatorMotor.setSelectedSensorPosition(
                (int) (this.rotatorMotor.getSelectedSensorPosition()
                        % SwerveConstants.FULL_REVOLUTION_TICKS));
    }

    /**
     * Resets the position of the absolute encoder on the rotator motor.
     *
     * <p>NOTE: this change does not permanently persist and will be lost upon power cycling.
     */
    void resetAbsoluteEncoder() {
        this.rotatorMotor.setSelectedSensorPosition(0);
    }

    /**
     * Gets the position of the drive motor in encoder units.
     * @return the position of the drive motor in encoder units.
     */
    double getDriveMotorPosition() {
        return driveMotor.getSelectedSensorPosition();
    }

    /**
     * Gets the velocity of the drive motor in encoder units.
     * @return the velocity of the drive motor in encoder units.
     */
    double getDriveMotorVelocity() {
        return driveMotor.getSelectedSensorVelocity();
    }

    /**
     * Gets the position of the rotator motor in encoder units.
     * Since the rotator is a mag encoder, this is the absolute position.
     * @return the absolute position of the rotator motor in encoder units.
     */
    double getRotatorMotorPosition() {
        return rotatorMotor.getSelectedSensorPosition();
    }

    /**
     * Gets the velocity of the rotator motor in encoder units.
     * @return the velocity of the rotator motor in encoder units.
     */
    double getRotatorMotorVelocity() {
        return rotatorMotor.getSelectedSensorVelocity();
    }

    void setMaxWheelAcceleration(double maxAccel) {
        maxAcceleration = maxAccel;
    }
}