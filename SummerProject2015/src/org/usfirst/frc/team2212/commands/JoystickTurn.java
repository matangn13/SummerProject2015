package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.JoystickMap;
import org.usfirst.frc.team2212.robot.Robot;
import org.usfirst.frc.team2212.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickTurn extends Command {

	public JoystickTurn() {
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	protected void execute() {
		Drivetrain.turn(JoystickMap.driver.getX());
	}

	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
