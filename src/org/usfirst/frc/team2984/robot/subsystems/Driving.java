package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Driving extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private CANTalon fLeft = new CANTalon(RobotMap.FRONT_LEFT_TALON_ID);
	private CANTalon fRight = new CANTalon(RobotMap.FRONT_RIGHT_TALON_ID);
	private CANTalon rLeft = new CANTalon(RobotMap.REAR_LEFT_TALON_ID);
	private CANTalon rRight = new CANTalon(RobotMap.REAR_RIGHT_TALON_ID);

	public void initDefaultCommand() {
//		this.setDefaultCommand(new DistanceSensor());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void setSpeed(double speed, double rotation) {
		fLeft.set(speed - rotation);
		fRight.set(speed + rotation);
		rLeft.set(-speed + rotation);
		rRight.set(-speed - rotation);
	}

}
