package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.RobotMap;
import org.usfirst.frc.team2984.robot.subsystems.Driving;
import org.usfirst.frc.team2984.robot.subsystems.Gyroscope;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TurnToAngle extends Command {
	private double angleToTurnTo;

	public TurnToAngle(double angleToTurnTo) {
		this.requires(Driving.getInstance());
		this.angleToTurnTo = angleToTurnTo;
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double tmpTurnTo = -(angleToTurnTo-Gyroscope.getInstance().getAngle())*RobotMap.pidProportion;
		tmpTurnTo = Math.max(Math.min(tmpTurnTo, 0.5), -0.5);
		SmartDashboard.putNumber("pidProportion", tmpTurnTo);
		Driving.getInstance().setSpeed(0, tmpTurnTo);

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {

		return Math.abs(Gyroscope.getInstance().getAngle()-angleToTurnTo) <= 1;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
