package frc.team4373.swerve;

import com.ctre.phoenix.motorcontrol.NeutralMode;

/**
 * A configuration object for a swerve bot.
 */
public class SwerveConfig {
    /**
     * The dimensions of the robot.
     * The units used do not matter, so long as they are the same.
     */
    public final RobotDimensions dimensions;
    /**
     * The {@link WheelsConfig} configuration for the wheels of the robot.
     */
    public final WheelsConfig wheels;
    /**
     * The CAN ID for the Pigeon IMU. It must be connected over CAN, not through the gadgeteer.
     */
    public final PigeonConfig pigeonConfig;

    /**
     * Constructs a new configuration object for a swerve bot.
     * @param dimensions the dimensions of the bot (unit-agnostic).
     * @param wheels a {@link WheelsConfig} object describing the bot's motors.
     * @param pigeonConfig the configuration object for the Pigeon IMU.
     */
    public SwerveConfig(RobotDimensions dimensions,
                        WheelsConfig wheels,
                        PigeonConfig pigeonConfig) {
        this.dimensions = dimensions;
        this.wheels = wheels;
        this.pigeonConfig = pigeonConfig;
    }

    /**
     * A configuration object for all four wheels of a swerve bot.
     */
    public static final class WheelsConfig {
        /**
         * The {@link MotorConfig} configuration for the front right drive motor.
         */
        public final MotorConfig right1Drive;
        /**
         * The {@link MotorConfig} configuration for the front right rotator motor.
         */
        public final MotorConfig right1Rotate;
        /**
         * The {@link MotorConfig} configuration for the rear right drive motor.
         */
        public final MotorConfig right2Drive;
        /**
         * The {@link MotorConfig} configuration for the rear right rotator motor.
         */
        public final MotorConfig right2Rotate;
        /**
         * The {@link MotorConfig} configuration for the front left drive motor.
         */
        public final MotorConfig left1Drive;
        /**
         * The {@link MotorConfig} configuration for the front left rotator motor.
         */
        public final MotorConfig left1Rotate;
        /**
         * The {@link MotorConfig} configuration for the rear left drive motor.
         */
        public final MotorConfig left2Drive;
        /**
         * The {@link MotorConfig} configuration for the rear left rotator motor.
         */
        public final MotorConfig left2Rotate;

        /**
         * The maximum speed, in native encoder units, allowed for the drive motors.
         */
        public final double maxWheelSpeed;
        /**
         * The maximum amperage allowed for the drive motors (to prevent brownout).
         */
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

    /**
     * A configuration object for a single motor.
     */
    public static final class MotorConfig {
        /**
         * The CAN ID of the motor's TalonSRX motor controller.
         */
        public final int id;
        /**
         * Whether or not the motor output should be inverted.
         */
        public final boolean inverted;
        /**
         * The mode for the motor when its input is zero.
         */
        public final NeutralMode neutralMode;
        /**
         * Whether or not the encoder is out of phase with the motor.
         */
        public final boolean encoderPhase;
        /**
         * The PID gains for the motor.
         */
        public final PID gains;

        /**
         * Constructs a new MotorConfig.
         * @param id the CAN ID of the motor's TalonSRX motor controller.
         * @param inverted whether to invert motor output values.
         * @param neutralMode the motor's passive neutral mode.
         * @param encoderPhase whether the encoder is out of phase with the motor.
         * @param gains the PID gains for the motor.
         */
        public MotorConfig(int id, boolean inverted,
                           NeutralMode neutralMode, boolean encoderPhase, PID gains) {
            this.id = id;
            this.inverted = inverted;
            this.neutralMode = neutralMode;
            this.encoderPhase = encoderPhase;
            this.gains = gains;
        }
    }

    /**
     * A configuration object for a Pigeon IMU.
     */
    public static final class PigeonConfig {
        /**
         * Represents a connection type through which a Pigeon can be accessed.
         *
         * <p>In the gadgeteer configuration, the Pigeon connects to a motor controller via a
         * ribbon cable; in the CAN configuration, the Pigeon connects independently to the CAN
         * chain. Use the {@link #NONE} connection type if no Pigeon is present.
         */
        public enum ConnectionType {
            GADGETEER, CAN, NONE
        }

        /**
         * An axis of a Pigeon IMU.
         */
        public enum Axis {
            YAW(0), PITCH(1), ROLL(2);

            protected int yprPos;

            /**
             * Constructs a new Axis with the given position in the yawPitchRoll array.
             * @param yprPos the position of the axis in the yawPitchRoll array.
             */
            Axis(int yprPos) {
                this.yprPos = yprPos;
            }
        }

        /**
         * Whether to invert outputs from the Pigeon.
         */
        public final boolean inverted;

        /**
         * The Pigeon's CAN ID (in CAN mode) or the ID of the motor controller to which it connects
         * (in gadgeteer mode).
         */
        public final int id;

        /**
         * The connection method by which the Pigeon can be accessed.
         */
        public final ConnectionType connectionType;

        /**
         * The axis of the Pigeon from which to read.
         */
        public final Axis axis;

        /**
         * Constructs a new Pigeon configuration object.
         * @param connectionType the connection method by which the Pigeon can be accessed.
         * @param id the CAN ID of the Pigeon or the motor controller to which it connects.
         * @param axis the axis of the Pigeon from which to read.
         * @param inverted whether to invert outputs from the Pigeon.
         */
        public PigeonConfig(ConnectionType connectionType, int id, Axis axis,
                            boolean inverted) {
            this.connectionType = connectionType;
            this.id = id;
            this.axis = axis;
            this.inverted = inverted;
        }

        /**
         * Returns a standard configuration for the absence of a Pigeon IMU.
         * @return the {@link PigeonConfig} for a robot with no Pigeon.
         */
        public static PigeonConfig noPigeon() {
            return new PigeonConfig(ConnectionType.NONE, -1, Axis.YAW, false);
        }
    }

    /**
     * A configuration object containing the gains for a PID controller.
     */
    public static final class PID {
        /**
         * The feedforward gain.
         */
        public final double kF;

        /**
         * The proportional gain.
         */
        public final double kP;

        /**
         * The integral gain.
         */
        public final double kI;

        /**
         * The derivative gain.
         */
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

    /**
     * A configuration object representing the dimensions of the robot.
     */
    public static final class RobotDimensions {
        /**
         * The trackwidth of the robot.
         * Trackwidth is the distance between the centers of the right and left wheels.
         * It must be in the same units as the wheelbase.
         */
        public final double trackwidth;

        /**
         * The wheelbase of the robot.
         * Wheelbase is the distance between the centers of the front and rear wheels.
         * It must be in the same units as the trackwidth.
         */
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
