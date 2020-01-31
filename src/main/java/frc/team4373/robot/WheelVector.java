package frc.team4373.robot;

/**
 * A programmatic representation of a vector that wheels can be set to.
 */
public class WheelVector {
    /**
     * The vector with 0 for both components.
     */
    public static final WheelVector ZERO = new WheelVector(0, 0);

    /**
     * The speed (i.e. magnitude) of the vector (in the range [-1, 1]).
     */
    public final double speed;
    /**
     * The angle (i.e. direction) of the vector in degrees.
     */
    public final double angle;

    /**
     * Constructs a new WheelVector.
     * @param speed the speed (i.e., the magnitude) of the vector in the range [-1, 1].
     * @param angle the angle (i.e., the direction) of the vector in degrees.
     */
    public WheelVector(double speed, double angle) {
        this.speed = speed;
        this.angle = angle;
    }

    /**
     * A set of four vectors that the bot can be set to.
     */
    public static class VectorSet {
        /**
         * The set of vectors which are all zero.
         */
        public static final VectorSet ZERO = new VectorSet(
                WheelVector.ZERO,
                WheelVector.ZERO,
                WheelVector.ZERO,
                WheelVector.ZERO);

        /**
         * The vector for the front right wheel.
         */
        public WheelVector right1;
        /**
         * The vector for the rear right wheel.
         */
        public WheelVector right2;
        /**
         * The vector for the front left wheel.
         */
        public WheelVector left1;
        /**
         * The vector for the rear left wheel.
         */
        public WheelVector left2;

        /**
         * Constructs a new WheelVector VectorSet.
         * @param right1 the vector for the front right wheel.
         * @param right2 the vector for the rear right wheel.
         * @param left1 the vector for the front left wheel.
         * @param left2 the vector for the rear left wheel.
         */
        public VectorSet(WheelVector right1, WheelVector right2,
                         WheelVector left1, WheelVector left2) {
            this.right1 = right1;
            this.right2 = right2;
            this.left1 = left1;
            this.left2 = left2;
        }

        public String toString() {
            return "R1: " + right1.toString() + ", R2: " + right2.toString()
                    + ", L1: " + left1.toString() + ", L2: " + left2.toString();
        }

        /**
         * Returns whether the given vector set is equal to another.
         * @param set the vector set against which to compare.
         * @return true if equal, false if not.
         */
        public boolean equals(WheelVector.VectorSet set) {
            return this.right1.equals(set.right1)
                    && this.right2.equals(set.right2)
                    && this.left1.equals(set.left1)
                    && this.left2.equals(set.left2);
        }
    }

    @Override
    public String toString() {
        return "(speed: " + this.speed + ", angle: " + this.angle + ")";
    }

    public boolean equals(WheelVector vector) {
        return this.speed - vector.speed < SwerveConstants.FP_EQUALITY_THRESHOLD
                && this.angle - vector.angle < SwerveConstants.FP_EQUALITY_THRESHOLD;
    }
}
