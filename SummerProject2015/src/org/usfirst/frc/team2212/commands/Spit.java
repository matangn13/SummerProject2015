package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Spit extends Command {

	public Spit() {
		super();
		requires(Robot.picker);
	}

	public Spit(double timeout) {
		super(timeout);
		requires(Robot.picker);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.picker.spit();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
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
