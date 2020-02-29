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
         * The {@link CurrentLimitConfig} configuration for current limiting.
         */
        public final CurrentLimitConfig currentLimitConfig;

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
         * @param currentLimitConfig the {@link CurrentLimitConfig} for current limiting.
         */
        public WheelsConfig(MotorConfig right1Drive, MotorConfig right1Rotate,
                            MotorConfig right2Drive, MotorConfig right2Rotate,
                            MotorConfig left1Drive, MotorConfig left1Rotate,
                            MotorConfig left2Drive, MotorConfig left2Rotate,
                            double maxWheelSpeed, CurrentLimitConfig currentLimitConfig) {
            this.right1Drive = right1Drive;
            this.right1Rotate = right1Rotate;
            this.right2Drive = right2Drive;
            this.right2Rotate = right2Rotate;
            this.left1Drive = left1Drive;
            this.left1Rotate = left1Rotate;
            this.left2Drive = left2Drive;
            this.left2Rotate = left2Rotate;

            this.maxWheelSpeed = maxWheelSpeed;
            this.currentLimitConfig = currentLimitConfig;
        }

        /**
         * Constructs a new configuration object for all wheels on a swerve bot (no current limit).
         * @param right1Drive the {@link MotorConfig} for the right 1 drive motor.
         * @param right1Rotate the {@link MotorConfig} for the right 1 rotator motor.
         * @param right2Drive the {@link MotorConfig} for the right 2 drive motor.
         * @param right2Rotate the {@link MotorConfig} for the right 2 rotator motor.
         * @param left1Drive the {@link MotorConfig} for the left 1 drive motor.
         * @param left1Rotate the {@link MotorConfig} for the left 1 rotator motor.
         * @param left2Drive the {@link MotorConfig} for the left 2 drive motor.
         * @param left2Rotate the {@link MotorConfig} for the left 2 rotator motor.
         * @param maxWheelSpeed the max speed, in encoder units, attainable by the drive motors.
         */
        public WheelsConfig(MotorConfig right1Drive, MotorConfig right1Rotate,
                            MotorConfig right2Drive, MotorConfig right2Rotate,
                            MotorConfig left1Drive, MotorConfig left1Rotate,
                            MotorConfig left2Drive, MotorConfig left2Rotate,
                            double maxWheelSpeed) {
            this(right1Drive,
                    right1Rotate,
                    right2Drive,
                    right2Rotate,
                    left1Drive,
                    left1Rotate,
                    left2Drive,
                    left2Rotate,
                    maxWheelSpeed,
                    CurrentLimitConfig.none);
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

    // PID- and sensor-related constants

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

    /**
     * A configuration object representing the current limiting to perform on the drivetrain.
     */
    public static final class CurrentLimitConfig {
        /**
         * The point beyond which current will be limited (for the rotator motors).
         */
        public final int rotatorMotorPeakAmperage;
        /**
         * The duration that the current draw is allowed to be over the peak amperage (rotator).
         */
        public final int rotatorMotorPeakDuration;
        /**
         * The amperage that the current draw is limited to (for the rotator motors).
         */
        public final int rotatorMotorContinuousAmperage;
        /**
         * Whether or not current limiting is enabled for the rotator motors.
         * If false, no current limiting configuration is set to the Talons.
         */
        public final boolean rotatorMotorLimitingEnabled;
        /**
         * The point beyond which current will be limited (for the drive motors).
         */
        public final int driveMotorPeakAmperage;
        /**
         * The duration that the current draw is allowed to be over the peak amperage (drive).
         */
        public final int driveMotorPeakDuration;
        /**
         * The amperage that the current draw is limited to (for the drive motors).
         */
        public final int driveMotorContinuousAmperage;
        /**
         * Whether or not current limiting is enabled for the drive motors.
         * If false, no current limiting configuration is set to the Talons.
         */
        public final boolean driveMotorLimitingEnabled;

        /**
         * Creates a CurrentLimitConfig object with the specified parameters.
         * @param rotatorMotorPeakAmperage the point beyond which current will be limited (rotate).
         * @param rotatorMotorPeakDuration the duration beyond peak amperage before limiting (R).
         * @param rotatorMotorContinuousAmperage the amperage that current is limited to (rotator).
         * @param rotatorMotorLimitingEnabled whether current limiting is enabled (rotator motors).
         * @param driveMotorPeakAmperage the point beyond which current will be limited (drive).
         * @param driveMotorPeakDuration the duration beyond peak amperage before limiting (drive).
         * @param driveMotorContinuousAmperage the amperage that current is limited to (drive).
         * @param driveMotorLimitingEnabled whether current limiting is enabled (rotator motors).
         */
        public CurrentLimitConfig(int rotatorMotorPeakAmperage,
                                  int rotatorMotorPeakDuration,
                                  int rotatorMotorContinuousAmperage,
                                  boolean rotatorMotorLimitingEnabled,
                                  int driveMotorPeakAmperage,
                                  int driveMotorPeakDuration,
                                  int driveMotorContinuousAmperage,
                                  boolean driveMotorLimitingEnabled) {
            this.rotatorMotorPeakAmperage = rotatorMotorPeakAmperage;
            this.rotatorMotorPeakDuration = rotatorMotorPeakDuration;
            this.rotatorMotorContinuousAmperage = rotatorMotorContinuousAmperage;
            this.rotatorMotorLimitingEnabled = rotatorMotorLimitingEnabled;
            this.driveMotorPeakAmperage = driveMotorPeakAmperage;
            this.driveMotorPeakDuration = driveMotorPeakDuration;
            this.driveMotorContinuousAmperage = driveMotorContinuousAmperage;
            this.driveMotorLimitingEnabled = driveMotorLimitingEnabled;
        }

        /**
         * Creates a CurrentLimitConfig object with the specified limit and exceedance duration.
         * The limit and duration are used for both the drive and rotator motors.
         * Once the current draw has been over the limit for the specified duration,
         *   it is capped at the limit.
         * @param amperageLimit the amperage limit for both the drive and rotator motors.
         * @param peakDuration the time that excessive current draw is allowed before limiting.
         */
        public CurrentLimitConfig(int amperageLimit, int peakDuration) {
            this(amperageLimit,
                    peakDuration,
                    amperageLimit,
                    true,
                    amperageLimit,
                    peakDuration,
                    amperageLimit,
                    true);
        }

        /**
         * Creates a CurrentLimitConfig object with the specified limit and exceedance duration.
         * Different values are given for the drive and rotator motors.
         * Once the current draw has been over the limit for the specified duration,
         *   it is capped at the limit.
         * @param driveMotorAmperageLimit the amperage limit for the drive motors.
         * @param driveMotorPeakDuration the time that excessive current draw is allowed (drive).
         * @param rotatorMotorAmperageLimit the amperage limit for the rotator motors.
         * @param rotatorMotorPeakDuration  the time that excessive current draw is allowed (R).
         */
        public CurrentLimitConfig(int driveMotorAmperageLimit,
                                  int driveMotorPeakDuration,
                                  int rotatorMotorAmperageLimit,
                                  int rotatorMotorPeakDuration) {
            this(rotatorMotorAmperageLimit,
                    rotatorMotorPeakDuration,
                    rotatorMotorAmperageLimit,
                    true,
                    driveMotorAmperageLimit,
                    driveMotorPeakDuration,
                    driveMotorAmperageLimit,
                    true);
        }

        /**
         * No current limiting.
         */
        public static final CurrentLimitConfig none =
                new CurrentLimitConfig(0, 0, 0, false, 0, 0, 0, false);
    }
}
