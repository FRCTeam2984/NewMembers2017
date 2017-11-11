package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;
import org.usfirst.frc.team2984.robot.commands.DriveJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Gyroscope extends Subsystem {

	private static Gyroscope instance;
	private ADXRS450_Gyro gyro;

	public static Gyroscope getInstance() {

		if (instance == null) {
			instance = new Gyroscope();
		}
		return instance;
	}

	private Gyroscope() {
		gyro = new ADXRS450_Gyro();
	}

	public double getAngle() {
		SmartDashboard.putNumber("Angle", gyro.getAngle() % 360);
		return gyro.getAngle() % 360;
	}

	public void calibrate() {
		this.gyro.calibrate();
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
