package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DistanceSensor extends Command {
	
    public DistanceSensor() {
    	this.requires( Robot.Driving );
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void execute() {
    	// This is what actually runs
    	// NON-INTERRUPTABLE
    }
    
    // Called once after isFinished returns true
    protected void end() {
    }
    
    protected void interrupted() {
    }

}
