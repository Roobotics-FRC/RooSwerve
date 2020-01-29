package frc.team4373.robot;

public class SwerveInputTransform {
    private double trackwidth;
    private double wheelbase;

    private final double radius;
    private final double lr;
    private final double wr;

    private double[] speeds = new double[SwerveConstants.WHEEL_COUNT];
    private double[] angles = new double[SwerveConstants.WHEEL_COUNT];

    /**
     * Constructs a new swerve input transform for given robot dimensions.
     * @param trackwidth the robot's trackwidth (unit-agnostic; units must match wheelbase).
     * @param wheelbase the robot's wheelbase (unit-agnostic; units must match trackwidth).
     */
    SwerveInputTransform(double trackwidth, double wheelbase) {
        this.trackwidth = trackwidth;
        this.wheelbase = wheelbase;

        this.radius = Math.sqrt(Math.pow(wheelbase, 2)
                + Math.pow(trackwidth, 2));
        this.lr = wheelbase / radius;
        this.wr = trackwidth / radius;
    }

    /**
     * Produces swerve velocity vectors relative to the field for the given input.
     *
     * <p>See https://www.chiefdelphi.com/t/107383
     * @param rotation the rotation of the joystick (CW is positive)
     * @param x the x coordinate of the joystick (right is positive)
     * @param y the y coordinate of the joystick (forward is positive)
     * @param imuAngle the current heading of the robot
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
     *
     * @param rotation the rotation of the joystick (CW is positive)
     * @param x the x coordinate of the joystick (right is positive)
     * @param y the y coordinate of the joystick (forward is positive)
     * @return a {@link WheelVector.VectorSet} of velocity vectors.
     */
    public WheelVector.VectorSet processOwnShipUp(double rotation, double x, double y) {
        final double A = x - rotation * lr;
        final double B = x + rotation * lr;
        final double C = y - rotation * wr;
        final double D = y + rotation * wr;

        speeds[0] = Math.sqrt(Math.pow(B, 2) + Math.pow(C, 2)); //front right
        speeds[1] = Math.sqrt(Math.pow(B, 2) + Math.pow(D, 2)); // front left
        speeds[2] = Math.sqrt(Math.pow(A, 2) + Math.pow(D, 2)); // rear left
        speeds[3] = Math.sqrt(Math.pow(A, 2) + Math.pow(C, 2)); // rear right

        angles[0] = Math.toDegrees(Math.atan2(B,C));
        angles[1] = Math.toDegrees(Math.atan2(B,D));
        angles[2] = Math.toDegrees(Math.atan2(A,D));
        angles[3] = Math.toDegrees(Math.atan2(A,C));

        final double highestWheelSpeed = Math.max(Math.max(speeds[0], speeds[1]),
                Math.max(speeds[2], speeds[3]));
        if (highestWheelSpeed > 1) {
            for (int i = 0; i < 4; ++i) {
                speeds[i] /= highestWheelSpeed;
            }
        }

        WheelVector right1 = new WheelVector(speeds[0], angles[0]);
        WheelVector left1 = new WheelVector(speeds[1], angles[1]);
        WheelVector left2 = new WheelVector(speeds[2], angles[2]);
        WheelVector right2 = new WheelVector(speeds[3], angles[3]);

        return new WheelVector.VectorSet(right1, right2, left1, left2);
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
        double refAngle = Math.toDegrees(Math.atan2(trackwidth / 2,
                wheelbase / 2));
        double r1Angle = 90 + refAngle;
        double l1Angle = 90 - refAngle;
        double l2Angle = -(90 - refAngle);
        double r2Angle = -(90 + refAngle);
        WheelVector r1 = new WheelVector(rate, r1Angle);
        WheelVector r2 = new WheelVector(rate, r2Angle);
        WheelVector l1 = new WheelVector(rate, l1Angle);
        WheelVector l2 = new WheelVector(rate, l2Angle);
        return new WheelVector.VectorSet(r1, r2, l1, l2);
    }
}
