package frc.team4373.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;

public class SwerveConfig {
    public final RobotDimensions dimensions;
    public final WheelsConfig wheels;
    public final int pigeonID;

    /**
     * Constructs a new configuration object for a swerve bot.
     * @param dimensions the dimensions of the bot (unit-agnostic).
     * @param wheels a {@link WheelsConfig} object describing the bot's motors.
     * @param pigeonID the CAN ID of the Pigeon IMU (cannot be gadgeteer).
     */
    public SwerveConfig(RobotDimensions dimensions,
                        WheelsConfig wheels,
                        int pigeonID) {
        this.dimensions = dimensions;
        this.wheels = wheels;
        this.pigeonID = pigeonID;
    }

    public static final class WheelsConfig {
        public final MotorConfig right1Drive;
        public final MotorConfig right1Rotate;
        public final MotorConfig right2Drive;
        public final MotorConfig right2Rotate;
        public final MotorConfig left1Drive;
        public final MotorConfig left1Rotate;
        public final MotorConfig left2Drive;
        public final MotorConfig left2Rotate;

        public final double maxWheelSpeed;
        public final int amperageLimit;

        /**
         * Constructs a new configuration object for all wheels on a swerve bot.
         * @param right1Drive the {@link MotorConfig} for the right 1 drive motor.
         * @param right1Rotate the {@link MotorConfig} for the right 1 rotator motor.
         * @param right2Drive the {@link MotorConfig} for the right 2 drive motor.
         * @param right2Rotate the {@link MotorConfig} for the right 2 rotator motor.
         * @param left1Drive the {@link MotorConfig} for the left 1 drive motor.
         * @param left1Rotate the {@link MotorConfig} for the left 1 rotator motor.
         * @param left2Drive the {@link MotorConfig} for the left 2 drive motor.
         * @param left2Rotate the {@link MotorConfig} for the left 2 rotator motor.
         * @param maxWheelSpeed the max speed, in encoder units, attainable by the drive motors.
         * @param amperageLimit the max allowed amperage to the drive motors (to prevent brownout).
         */
        public WheelsConfig(MotorConfig right1Drive, MotorConfig right1Rotate,
                            MotorConfig right2Drive, MotorConfig right2Rotate,
                            MotorConfig left1Drive, MotorConfig left1Rotate,
                            MotorConfig left2Drive, MotorConfig left2Rotate,
                            double maxWheelSpeed, int amperageLimit) {
            this.right1Drive = right1Drive;
            this.right1Rotate = right1Rotate;
            this.right2Drive = right2Drive;
            this.right2Rotate = right2Rotate;
            this.left1Drive = left1Drive;
            this.left1Rotate = left1Rotate;
            this.left2Drive = left2Drive;
            this.left2Rotate = left2Rotate;

            this.maxWheelSpeed = maxWheelSpeed;
            this.amperageLimit = amperageLimit;
        }
    }

    public static final class MotorConfig {
        public final int ID;
        public final boolean inverted;
        public final NeutralMode neutralMode;
        public final boolean encoderPhase;
        public final PID gains;

        /**
         * Constructs a new MotorConfig.
         * @param ID the CAN ID of the motor's TalonSRX motor controller.
         * @param inverted whether to invert motor output values.
         * @param neutralMode the motor's passive neutral mode.
         */
        public MotorConfig(int ID, boolean inverted,
                           NeutralMode neutralMode, boolean encoderPhase, PID gains) {
            this.ID = ID;
            this.inverted = inverted;
            this.neutralMode = neutralMode;
            this.encoderPhase = encoderPhase;
            this.gains = gains;
        }
    }

    // PID- and sensor-related constants
    public static final class PID {
        public final double kF;
        public final double kP;
        public final double kI;
        public final double kD;

        /**
         * Constructs a new PID parameters object.
         * @param kF feed-forward gain.
         * @param kP proportional gain.
         * @param kI integral gain.
         * @param kD derivative gain.
         */
        public PID(double kF, double kP, double kI, double kD) {
            this.kF = kF;
            this.kP = kP;
            this.kI = kI;
            this.kD = kD;
        }
    }

    public static final class RobotDimensions {
        public final double trackwidth;
        public final double wheelbase;

        /**
         * Constructs an object describing the dimensions of a swerve bot.
         * @param trackwidth the robot's trackwidth (unit-agnostic; units must match wheelbase).
         * @param wheelbase the robot's wheelbase (unit-agnostic; units must match trackwidth).
         */
        public RobotDimensions(double trackwidth, double wheelbase) {
            this.trackwidth = trackwidth;
            this.wheelbase = wheelbase;
        }
    }
}
