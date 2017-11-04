package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.subsystems.Driving;
import org.usfirst.frc.team2984.robot.subsystems.Sensor;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	Driving new_drive = Driving.getInstance();
	Sensor new_sensor = Sensor.getInstance();

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		new_drive.setSpeed(0.2, 0);
	}

	@Override
	protected boolean isFinished() {

		return new_sensor.getDistance() >= 1;

	}

}
