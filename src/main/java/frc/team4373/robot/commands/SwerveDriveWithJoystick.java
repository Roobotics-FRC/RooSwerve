package frc.team4373.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4373.robot.SwerveDrivetrain;

import java.util.function.DoubleSupplier;

/**
 * A Javadoc template. TODO: Update SwerveDriveWithJoystick Javadoc.
 */
public class SwerveDriveWithJoystick extends Command {
    private SwerveDrivetrain drivetrain;
    private DoubleSupplier xGetter;
    private DoubleSupplier yGetter;
    private DoubleSupplier rotationGetter;

    public SwerveDriveWithJoystick(DoubleSupplier xGetter,
                                   DoubleSupplier yGetter,
                                   DoubleSupplier rotationGetter,
                                   SwerveDrivetrain drivetrain) {
        requires(this.drivetrain = drivetrain);
        this.xGetter = xGetter;
        this.yGetter = yGetter;
        this.rotationGetter = rotationGetter;
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