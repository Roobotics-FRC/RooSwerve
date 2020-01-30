package frc.team4373.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4373.robot.SwerveDrivetrain;

import java.util.function.DoubleSupplier;

/**
 * A default command for controlling a SwerveDrive.
 */
public class SwerveDriveWithJoystick extends Command {
    private SwerveDrivetrain drivetrain;
    private DoubleSupplier xGetter;
    private DoubleSupplier yGetter;
    private DoubleSupplier rotationGetter;

    /**
     * Constructs a new SwerveDriveWithJoystick command.
     * @param xGetter a supplier of the x joystick input, [-1, 1].
     * @param yGetter  a supplier of the y joystick input, [-1, 1].
     * @param twistGetter a supplier of the twist (z) joystick input, [-1, 1].
     * @param drivetrain the {@link SwerveDrivetrain} subsystem to drive.
     */
    public SwerveDriveWithJoystick(DoubleSupplier xGetter,
                                   DoubleSupplier yGetter,
                                   DoubleSupplier twistGetter,
                                   SwerveDrivetrain drivetrain) {
        requires(this.drivetrain = drivetrain);
        this.xGetter = xGetter;
        this.yGetter = yGetter;
        this.rotationGetter = twistGetter;
    }

    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    protected void execute() {
        double x = xGetter.getAsDouble();
        double y = yGetter.getAsDouble();
        double rotation = rotationGetter.getAsDouble();
        drivetrain.drive(rotation, x, y);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        this.drivetrain.stop();
    }

    @Override
    protected void interrupted() {
        this.end();
    }
}