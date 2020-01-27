package frc.team4373.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team4373.robot.SwerveConstants;
import frc.team4373.robot.SwerveConfig;
import frc.team4373.robot.input.WheelVector;

/**
 * Represents a swerve wheel with two motors.
 */
public class SwerveWheel {
    private final String name;
    private final double maxWheelSpeed;

    private WPI_TalonSRX driveMotor;
    private WPI_TalonSRX rotatorMotor;

    private boolean isInverted = false;

    /**
     * Constructs a new swerve wheel for the specified wheel.
     * @param driveMotorConfig the config for the drive motor.
     * @param rotatorMotorConfig the config for the rotator motor.
     */
    public SwerveWheel(String name,
                       SwerveConfig.MotorConfig driveMotorConfig,
                       SwerveConfig.MotorConfig rotatorMotorConfig,
                       double maxWheelSpeed, int amperageLimit) {
        this.name = name;
        this.maxWheelSpeed = maxWheelSpeed;

        this.driveMotor = new WPI_TalonSRX(driveMotorConfig.port);
        this.rotatorMotor = new WPI_TalonSRX(rotatorMotorConfig.port);

        this.driveMotor.configPeakCurrentLimit(amperageLimit,
                SwerveConstants.TALON_TIMEOUT_MS);
        this.driveMotor.enableCurrentLimit(true);

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
    public void set(double speed, double heading) {

        heading *= SwerveConstants.DEGREES_TO_ENCODER_UNITS;

        double currentRotation = rotatorMotor.getSelectedSensorPosition();
        double rotationError = Math.IEEEremainder(heading - currentRotation,
                SwerveConstants.WHEEL_ENCODER_TICKS);

        SmartDashboard.putNumber("swerve/" + this.name + "/Pre-Inv Rot", rotationError);

        // minimize azimuth rotation, reversing drive if necessary
        isInverted = Math.abs(rotationError) > 0.25 * SwerveConstants.WHEEL_ENCODER_TICKS;
        if (isInverted) {
            rotationError -= Math.copySign(0.5 * SwerveConstants.WHEEL_ENCODER_TICKS,
                    rotationError);
            speed = -speed;
        }

        SmartDashboard.putNumber("swerve/" + this.name + "/Rot Offset", rotationError);
        SmartDashboard.putNumber("swerve/" + this.name + "/Rot Setpt",
                currentRotation + rotationError);
        SmartDashboard.putNumber("swerve/" + this.name + "/Speed",
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
    public void setPID(SwerveConfig.PID drivePID, SwerveConfig.PID rotatorPID) {
        if (drivePID != null) {
            setDrivePID(drivePID);
        }
        if (rotatorPID != null) {
            setRotatorPID(rotatorPID);
        }
    }

    private void setRotatorPID(SwerveConfig.PID pid) {
        this.rotatorMotor.config_kP(0, pid.kP);
        this.rotatorMotor.config_kI(0, pid.kI);
        this.rotatorMotor.config_kD(0, pid.kD);
        this.rotatorMotor.config_kF(0, pid.kF);
    }

    private void setDrivePID(SwerveConfig.PID pid) {
        this.driveMotor.config_kP(0, pid.kP);
        this.driveMotor.config_kI(0, pid.kI);
        this.driveMotor.config_kD(0, pid.kD);
        this.driveMotor.config_kF(0, pid.kF);
    }

    public void setPercentOutput(double speed, double heading) {
        this.driveMotor.set(ControlMode.PercentOutput, speed);
        this.rotatorMotor.set(ControlMode.PercentOutput, heading);
    }

    /**
     * Stops all motors.
     */
    public void stop() {
        this.driveMotor.stopMotor();
        this.rotatorMotor.stopMotor();
    }

    public WheelVector encoderValues() {
        return new WheelVector(driveMotor.getSelectedSensorVelocity(),
                rotatorMotor.getSelectedSensorPosition());
    }

    /**
     * Gets the percent output of the drive motor.
     * @return the percent output, [-1, 1].
     */
    public double drivePercentOutput() {
        return this.driveMotor.getMotorOutputPercent();
    }

    /**
     * Reduces (for the duration of the power cycle) the rotator motor's encoder's position
     * modulo the number of ticks in a full revolution.
     */
    public void modularizeAbsoluteEncoder() {
        this.rotatorMotor.setSelectedSensorPosition(
                (int) (this.rotatorMotor.getSelectedSensorPosition()
                        % SwerveConstants.FULL_REVOLUTION_TICKS));
    }

    public void resetAbsoluteEncoder() {
        this.rotatorMotor.setSelectedSensorPosition(0);
    }
}