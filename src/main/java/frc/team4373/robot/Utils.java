package frc.team4373.robot;

final class Utils {
    private Utils() {}

    /**
     * Takes an angle in degrees and reduces it to its smallest positive equivalent from 0 to 360.
     * @param angle the angle to normalize, in degrees.
     * @return the angle represented as a positive angle on the range [0, 360].
     */
    static double normalizeAngle(double angle) {
        return leastResidue(angle, 360);
    }

    /**
     * Calculates a normalized angle from the y-axis to a specified point.
     * @param x the x-coordinate of the point.
     * @param y the y-coordinate of the point.
     * @return the normalized angle from the y-axis to the point, in degrees.
     */
    static double calculateYOffset(double x, double y) {
        // edge case b/c atan2 returns 0 instead of 90 for (0, 0)
        if (x == 0 && y == 0) {
            return 0;
        }
        return Utils.normalizeAngle(90 - Math.toDegrees(Math.atan2(y, x)));

        // // Compute the angle relative to the y-axis (90°)
        // double rawAngle = 90 - Math.toDegrees(Math.atan2(rooGetY(), rooGetX()));
        // // Normalize the angle so that it is positive
        // return Utils.normalizeAngle(rawAngle);
    }

    /**
     * Computes the least residue (i.e., > 0) of a number n modulo the given modulus.
     *
     * @param n the number whose least residue to compute.
     * @param modulus the modulus in which to compute the least residue.
     * @return the least residue.
     *
     * @throws IllegalArgumentException if modulus <= 0.
     */
    static double leastResidue(double n, double modulus) throws IllegalArgumentException {
        if (modulus <= 0) {
            throw new IllegalArgumentException("Modulus cannot be less than or equal to zero.");
        }
        return ((n % modulus) + modulus) % modulus;
    }

    /**
     * Constrains a percent output to [-1, 1].
     * @param output the percent output value to constrain.
     * @return the input percent output constrained to the safe range.
     */
    static double constrainPercentOutput(double output) {
        if (output > 1) {
            return 1;
        }
        if (output < -1) {
            return -1;
        }
        return output;
    }
}
