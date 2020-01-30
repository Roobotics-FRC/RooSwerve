package frc.team4373.robot;

import com.ctre.phoenix.sensors.PigeonIMU;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4373.robot.commands.SwerveDriveWithJoystick;

/**
 * A programmatic representation of the robot's drivetrain.
 */
public abstract class SwerveDrivetrain extends Subsystem {
    public enum WheelID {
        RIGHT_1, RIGHT_2, LEFT_1, LEFT_2
    }

    public enum DriveMode {
        NORTH_UP, OWN_SHIP_UP
    }

    public enum BrakeMode {
        IMPLODE, OCTAGON, NONE
    }

    public SwerveInputTransform transform;

    private SwerveWheel right1;
    private SwerveWheel right2;
    private SwerveWheel left1;
    private SwerveWheel left2;
    private PigeonIMU pigeon;
    private double initialAngle;

    private DriveMode driveMode = DriveMode.NORTH_UP;
    private BrakeMode brakeMode = BrakeMode.IMPLODE;

    private WheelVector.VectorSet brakeVectors;

    protected SwerveDrivetrain(SwerveConfig config) {
        this.right1 = new SwerveWheel(WheelID.RIGHT_1,
                config.wheels.right1Drive, config.wheels.right1Rotate,
                config.wheels.maxWheelSpeed, config.wheels.amperageLimit);
        this.right2 = new SwerveWheel(WheelID.RIGHT_2,
                config.wheels.right2Drive, config.wheels.right2Rotate,
                config.wheels.maxWheelSpeed, config.wheels.amperageLimit);
        this.left1 = new SwerveWheel(WheelID.LEFT_1,
                config.wheels.left1Drive, config.wheels.left1Rotate,
                config.wheels.maxWheelSpeed, config.wheels.amperageLimit);
        this.left2 = new SwerveWheel(WheelID.LEFT_2,
                config.wheels.left2Drive, config.wheels.left2Rotate,
                config.wheels.maxWheelSpeed, config.wheels.amperageLimit);

        this.pigeon = new PigeonIMU(config.pigeonPort);
        this.initialAngle = getPigeonYawRaw();

        this.transform = new SwerveInputTransform(config.dimensions.trackwidth,
                config.dimensions.wheelbase);

        this.brakeVectors = this.transform.calculateBrakeVectors(brakeMode);
    }

    /**
     * Stops the robot (i.e. sets outputs of all motors of all wheels to zero).
     */
    public void stop() {
        this.right1.stop();
        this.right2.stop();
        this.left1.stop();
        this.left2.stop();
    }

    /**
     * Drives using the transform for the given parameters.
     * @param rotation the rotation, in degrees.
     * @param x the x-coordinate, -1 to 1.
     * @param y the y-coordinate, -1 to 1.
     */
    public void drive(double rotation, double x, double y) {
        if ((rotation == x && x == y && y == 0) && (this.brakeMode != BrakeMode.NONE)) {
            setWheelsPID(brakeVectors);
            return;
        }
        switch (driveMode) {
            case NORTH_UP:
                setWheelsPID(transform.processNorthUp(rotation, x, y, getAngle()));
                break;
            case OWN_SHIP_UP:
                setWheelsPID(transform.processOwnShipUp(rotation, x, y));
                break;
            default: break;
        }
    }

    /**
     * Sets velocity vectors to the four SwerveWheels with PID setpoints for both speed and angle.
     * @param vectors the four vectors ordered right1, left1, left2, right2.
     */
    public void setWheelsPID(WheelVector.VectorSet vectors) {
        if (vectors.right1 != null) this.right1.set(vectors.right1.speed, vectors.right1.angle);
        if (vectors.right2 != null) this.right2.set(vectors.right2.speed, vectors.right2.angle);
        if (vectors.left1 != null) this.left1.set(vectors.left1.speed, vectors.left1.angle);
        if (vectors.left2 != null) this.left2.set(vectors.left2.speed, vectors.left2.angle);
    }

    /**
     * Sets vectors to the SwerveWheels with a PID setpoint for angle and % output for speed.
     * @param vectors the four vectors ordered right1, left1, left2, right2.
     */
    public void setWheelsPercOut(WheelVector.VectorSet vectors) {
        if (vectors.right1 != null) {
            this.right1.setPercentOutput(vectors.right1.speed, vectors.right1.angle);
        }
        if (vectors.right2 != null) {
            this.right2.setPercentOutput(vectors.right2.speed, vectors.right2.angle);
        }
        if (vectors.left1 != null) {
            this.left1.setPercentOutput(vectors.left1.speed, vectors.left1.angle);
        }
        if (vectors.left2 != null) {
            this.left2.setPercentOutput(vectors.left2.speed, vectors.left2.angle);
        }
    }

    /**
     * Returns the current angle relative to the starting position (mod 360).
     */
    public double getAngle() {
        return Utils.normalizeAngle(getPigeonYawRaw() - initialAngle);
    }

    /**
     * Returns the raw Pigeon yaw value.
     * @return Pigeon yaw value.
     */
    public double getPigeonYawRaw() {
        double[] ypr = new double[3];
        this.pigeon.getYawPitchRoll(ypr);
        return ypr[0] * -1;
    }

    /**
     * Gets the percent output of the specified SwerveWheel.
     * @param wheelID the ID of the wheel.
     * @return the wheel's percent output, [-1, 1].
     */
    public double getPercentOutput(WheelID wheelID) {
        return getWheel(wheelID).drivePercentOutput();
    }

    /**
     * Gets the current position of the drive motor.
     * @param wheelID the ID of the wheel whose position to fetch.
     * @return the current position in encoder units.
     */
    public double getDriveMotorPosition(WheelID wheelID) {
        return getWheel(wheelID).getDriveMotorPosition();
    }

    /**
     * Gets the average of the drive motor positions.
     * @return average of drive position in encoder units.
     */
    public double getAverageDriveMotorPosition() {
        return (getDriveMotorPosition(WheelID.LEFT_1)
                + getDriveMotorPosition(WheelID.LEFT_2)
                + getDriveMotorPosition(WheelID.RIGHT_1)
                + getDriveMotorPosition(WheelID.RIGHT_2)) / SwerveConstants.WHEEL_COUNT;
    }

    public double getDriveMotorVelocity(WheelID wheelID) {
        return getWheel(wheelID).getDriveMotorVelocity();
    }

    public double getRotatorMotorPosition(WheelID wheelID) {
        return getWheel(wheelID).getRotatorMotorPosition();
    }

    public double getRotatorMotorVelocity(WheelID wheelID) {
        return getWheel(wheelID).getRotatorMotorVelocity();
    }

    public void setPID(WheelID wheelID, SwerveConfig.PID drivePID, SwerveConfig.PID rotatorPID) {
        getWheel(wheelID).setPID(drivePID, rotatorPID);
    }

    public void setDriveMode(DriveMode driveMode) {
        this.driveMode = driveMode;
    }

    public DriveMode getDriveMode() {
        return this.driveMode;
    }

    public void setBrakeMode(BrakeMode brakeMode) {
        this.brakeMode = brakeMode;
        this.brakeVectors = this.transform.calculateBrakeVectors(brakeMode);
    }

    public BrakeMode getBrakeMode() {
        return this.brakeMode;
    }

    private SwerveWheel getWheel(WheelID wheelID) {
        switch (wheelID) {
            case RIGHT_1:
                return this.right1;
            case RIGHT_2:
                return this.right2;
            case LEFT_1:
                return this.left1;
            case LEFT_2:
                return this.left2;
            default:
                return getWheel(WheelID.RIGHT_1);
        }
    }

    /**
     * Resets the encoders to within [-4095, 4095]
     * Call this method in `robotInit` to (almost) eliminate the possibility of
     *  accumulator rollover during one power cycle.
     */
    public void modularizeEncoders() {
        this.right1.modularizeAbsoluteEncoder();
        this.right2.modularizeAbsoluteEncoder();
        this.left1.modularizeAbsoluteEncoder();
        this.left2.modularizeAbsoluteEncoder();
    }

    /**
     * This function should <b>NEVER</b> <i>regularly</i> be called.
     * It should be called once per mechanical change, with all wheels facing forward.
     */
    public void resetEncoder(WheelID wheelID) {
        getWheel(wheelID).resetAbsoluteEncoder();
    }

    /**
     * Resets the pigeon's yaw to consider the current orientation field-forward.
     */
    public void resetPigeonYaw() {
        this.initialAngle = this.getPigeonYawRaw();
    }
}
