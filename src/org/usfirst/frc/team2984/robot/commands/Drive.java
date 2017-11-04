package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.subsystems.Driving;
import org.usfirst.frc.team2984.robot.subsystems.Sensor;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	Driving new_drive = new Driving();
	Sensor new_sensor = new Sensor();


	@Override
	protected void initialize() {
		new_drive.setSpeed(10, 0);
	}
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		super.execute();
	}
	public void moveUntilWall() {
		
	}
	}
	public void moveUntilWall() {
		if (new_sensor.get_distance() > 0) {
		
			new_drive.setSpeed(0, 0);
			return false;
		}
		else {
			return true;

		}
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
