package org.usfirst.frc.team2984.robot;

import org.usfirst.frc.team2984.robot.commands.CalibrateGyro;
import org.usfirst.frc.team2984.robot.commands.Drive;
import org.usfirst.frc.team2984.robot.commands.PID;
import org.usfirst.frc.team2984.robot.commands.TurnToAngle;
import org.usfirst.frc.team2984.robot.subsystems.Gyroscope;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Button button = new JoystickButton(stick, buttonNumber);
	public Joystick stick = new Joystick(0);

	public OI() {
		Button button1 = new JoystickButton(stick, 1);
		button1.whenPressed(new Drive());
		

		Button button2 = new JoystickButton(stick, 2);
		button2.whenPressed(new TurnToAngle(90));
		
		Button button3 = new JoystickButton(stick, 3);
		button3.whenPressed(new CalibrateGyro());

		Button button5 = new JoystickButton(stick, 5);
		button5.whenPressed(new PID(0.01));
		
		Button button6 = new JoystickButton(stick, 6);
		button6.whenPressed(new PID(-0.01));
	}
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
