package frc.team4373.swerve;

/**
 * Holds various mappings and constants.
 */

final class SwerveConstants {
    private SwerveConstants() {}

    // Conversion factors
    static final double DEGREES_TO_ENCODER_UNITS = 4096d / 360d;
    static final double DEGREES_TO_PIGEON_UNITS = 8192d / 360d;

    // Wheels et al.
    // Max speed really seems around 8000, but we want some leeway
    static final int PID_IDX = 0;
    static final int WHEEL_COUNT = 4;
    static final double WHEEL_ENCODER_TICKS = 4096d;
    static final double FULL_REVOLUTION_TICKS = 360 * DEGREES_TO_ENCODER_UNITS;
    static final double HALF_REVOLUTION_TICKS = 180 * DEGREES_TO_ENCODER_UNITS;
    static final int TALON_TIMEOUT_MS = 1000;

    // Programmatic resources
    static final double FP_EQUALITY_THRESHOLD = 1e-5;
}