package org.usfirst.frc.team2984.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int FRONT_LEFT_TALON_ID = 14;
	public static final int FRONT_RIGHT_TALON_ID = 4;
	public static final int REAR_LEFT_TALON_ID = 16;
	public static final int REAR_RIGHT_TALON_ID = 1;
	public static final double pidProportion = 0.05;

}
