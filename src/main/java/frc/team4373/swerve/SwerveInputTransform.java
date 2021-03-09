package frc.team4373.swerve;

import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.kinematics.*;
import edu.wpi.first.wpilibj.util.Units;

import java.util.function.DoubleUnaryOperator;

/**
 * A class to transform inputs into the proper swerve outputs.
 */
public class SwerveInputTransform {
    private final double robotMaxSpeedMetersPerSecond;
    private final double robotMaxRotationRadiansPerSecond;
    private final double maxWheelSpeed;
    private final DoubleUnaryOperator nativeUnitsToMetersPerSecond;
    private final DoubleUnaryOperator metersPerSecondToNativeUnits;

    final SwerveDriveKinematics kinematics;

    private final double radius;

    private final double rotationRefAngle;

    /**
     * Constructs a new swerve input transform for given robot dimensions.
     * @param trackwidth the robot's trackwidth, in inches.
     * @param wheelbase the robot's wheelbase, in inches.
     */
    public SwerveInputTransform(double trackwidth, double wheelbase, double maxWheelSpeed,
                                double nativeUnitsPerInch) {
        trackwidth /= 39.37; //inches to meters
        wheelbase /= 39.37;

        this.radius = Math.hypot(trackwidth / 2, wheelbase / 2);

        this.kinematics = new SwerveDriveKinematics(
                new Translation2d(wheelbase / 2, trackwidth / 2), //front left
                new Translation2d(wheelbase / 2, -trackwidth / 2), //front right
                new Translation2d(-wheelbase / 2, -trackwidth / 2), //back right
                new Translation2d(-wheelbase / 2, trackwidth / 2) //back left
        );

        this.nativeUnitsToMetersPerSecond = (nu) -> Units.inchesToMeters(nu / nativeUnitsPerInch)
                * 10;
        this.metersPerSecondToNativeUnits = (mps) -> Units.metersToInches(mps)
                * nativeUnitsPerInch / 10;

        this.robotMaxSpeedMetersPerSecond =
                nativeUnitsToMetersPerSecond.applyAsDouble(maxWheelSpeed);
        this.robotMaxRotationRadiansPerSecond = this.robotMaxSpeedMetersPerSecond / radius;

        this.maxWheelSpeed = maxWheelSpeed;
        rotationRefAngle = Math.toDegrees(Math.atan2(trackwidth / 2,
                wheelbase / 2));
    }

    private WheelVector.VectorSet fromSwerveModuleStates(SwerveModuleState[] states) {
        double[] speeds = new double[4];
        double highestWheelSpeed = 0;
        for (int i = 0; i < 4; i++) {
            //meters per second to native units
            double nativeVelocityUnits =
                    metersPerSecondToNativeUnits.applyAsDouble(states[i].speedMetersPerSecond);
            //native units to fraction of maximum speed
            double fractionOfMaxSpeed = nativeVelocityUnits / maxWheelSpeed;
            highestWheelSpeed = Math.max(highestWheelSpeed, fractionOfMaxSpeed);
            speeds[i] = fractionOfMaxSpeed;
        }
        if (highestWheelSpeed > 1) {
            for (int i = 0; i < 4; i++) {
                speeds[i] /= highestWheelSpeed;
            }
        }
        return new WheelVector.VectorSet(
                new WheelVector(speeds[1], -states[1].angle.getDegrees()),
                new WheelVector(speeds[2], -states[2].angle.getDegrees()),
                new WheelVector(speeds[0], -states[0].angle.getDegrees()),
                new WheelVector(speeds[3], -states[3].angle.getDegrees()));
    }

    /**
     * Produces swerve velocity vectors relative to the field for the given input.
     * All inputs are a fraction of maximum speed on the interval [-1,1].
     *
     * <p>See https://www.chiefdelphi.com/t/107383
     * @param rotation the rotation of the joystick (CW is positive)
     * @param x the x coordinate of the joystick (right is positive)
     * @param y the y coordinate of the joystick (forward is positive)
     * @param imuAngle the current heading of the robot (CW is positive)
     * @return a {@link WheelVector.VectorSet} of velocity vectors.
     */
    public WheelVector.VectorSet processNorthUp(double rotation, double x, double y,
                                                       double imuAngle) {
        double angle = Math.toRadians(imuAngle);

        final double temp = y * Math.cos(angle) + x * Math.sin(angle);
        // TODO: why are the signs flipped here?
        x = -y * Math.sin(angle) + x * Math.cos(angle);
        y = temp;

        return processOwnShipUp(rotation, x, y);
    }

    /**
     * Produces swerve velocity vectors relative to the robot for the given inputs.
     * All inputs are a fraction of maximum speed on the interval [-1,1].
     *
     * @param rotation the rotation of the joystick (CW is positive)
     * @param x the x coordinate of the joystick (right is positive)
     * @param y the y coordinate of the joystick (forward is positive)
     * @return a {@link WheelVector.VectorSet} of velocity vectors.
     */
    public WheelVector.VectorSet processOwnShipUp(double rotation, double x, double y) {
        return fromSwerveModuleStates(
                kinematics.toSwerveModuleStates(
                        new ChassisSpeeds(
                                y * robotMaxSpeedMetersPerSecond,
                                -x * robotMaxSpeedMetersPerSecond,
                                -rotation * robotMaxRotationRadiansPerSecond)));
    }

    /**
     * Processes x-y input from the joystick to produce translational-only movement vectors.
     * @param x the x-coordinate of the joystick's position (right-positive).
     * @param y the y-coordinate of the joystick's position (forward-positive).
     * @return a {@link WheelVector.VectorSet} of translational movement vectors.
     */
    public WheelVector.VectorSet processTranslation(double x, double y) {
        double angle = Utils.calculateYOffset(x, y);
        double magnitude = Math.sqrt(x * x + y * y);
        if (magnitude > 1) magnitude = 1;
        WheelVector vec = new WheelVector(magnitude, angle);
        return new WheelVector.VectorSet(vec, vec, vec, vec);
    }

    /**
     * Processes rotational input from the joystick to produce rotational-only movement vectors.
     * @param rate the rate of rotation, [-1, 1].
     * @return a {@link WheelVector.VectorSet} of rotational movement vectors.
     */
    public WheelVector.VectorSet processRotation(double rate) {
        double r1Angle = 90 + rotationRefAngle;
        double l1Angle = 90 - rotationRefAngle;
        double l2Angle = -(90 - rotationRefAngle);
        double r2Angle = -(90 + rotationRefAngle);
        WheelVector r1 = new WheelVector(rate, r1Angle);
        WheelVector r2 = new WheelVector(rate, r2Angle);
        WheelVector l1 = new WheelVector(rate, l1Angle);
        WheelVector l2 = new WheelVector(rate, l2Angle);
        return new WheelVector.VectorSet(r1, r2, l1, l2);
    }

    /**
     * Calculates a {@link WheelVector.VectorSet} for the given brake mode.
     * @param brakeMode the brake mode for which to calculate vectors.
     * @return the vectors for the specified brake mode using the configured robot dimensions.
     */
    public WheelVector.VectorSet calculateBrakeVectors(SwerveDrivetrain.BrakeMode brakeMode) {
        switch (brakeMode) {
            case IMPLODE:
                WheelVector.VectorSet vectors = processRotation(0);
                WheelVector tmp = vectors.left1;
                vectors.left1 = (vectors.right2 = vectors.left2); //assignments in Java return
                vectors.left2 = (vectors.right1 = tmp); //the assigned value, allowing this.
                return vectors;
            case OCTAGON: return processRotation(0);
            case NONE: return null;
            default: break;
        }
        return null;
    }
}
