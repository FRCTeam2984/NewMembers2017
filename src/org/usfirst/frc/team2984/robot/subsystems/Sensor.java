package org.usfirst.frc.team2984.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Sensor extends Subsystem {
	private static Sensor instance;
	AnalogInput sensor;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public static Sensor getInstance() {
		if (instance == null) {
			instance = new Sensor();
		}
		return instance;
	}

	private Sensor() {
		this.sensor = new AnalogInput(0);

	}

	public double getDistance() {
		return this.sensor.getVoltage();
	}

}
