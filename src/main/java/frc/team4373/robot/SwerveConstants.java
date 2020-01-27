package frc.team4373.robot;

/**
 * Holds various mappings and constants.
 */

public final class SwerveConstants {
    private SwerveConstants() {}

    // Conversion factors
    public static final double DEGREES_TO_ENCODER_UNITS = 4096d / 360d;
    public static final double DEGREES_TO_PIGEON_UNITS = 8192d / 360d;

    // Wheels et al.
    // Max speed really seems around 8000, but we want some leeway
    public static final int PID_IDX = 0;
    public static final int WHEEL_COUNT = 4;
    public static final double WHEEL_ENCODER_TICKS = 4096d;
    public static final double FULL_REVOLUTION_TICKS = 360 * DEGREES_TO_ENCODER_UNITS;
    private static final double HALF_REVOLUTION_TICKS = 180 * DEGREES_TO_ENCODER_UNITS;
    public static final int TALON_TIMEOUT_MS = 1000;

    // Programmatic resources
    public static final double FP_EQUALITY_THRESHOLD = 1e-5;
}