package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Pick extends Command {

	public Pick() {
		requires(Robot.picker);
	}

	protected void initialize() {
		if (!Robot.picker.isBallInside()) {
			Robot.picker.pick();
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	protected boolean isFinished() {
		return Robot.picker.isBallInside();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.picker.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
