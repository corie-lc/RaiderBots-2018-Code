/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7674.RaiderBots.commands;

import org.usfirst.frc7674.RaiderBots.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CollectorCollect extends Command {
  public CollectorCollect() {
    requires(Robot.collector);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
   //double leftSignal = Robot.oi.operatorController.triggers.getTwist();
    //System.out.println(leftSignal);
   // double rightSignal = -1* Robot.oi.operatorController.getRawAxis(3);
    double signal =  Robot.oi.operatorController.triggers.getTwist();
    // CHANGE CODE TO THIS(BELOW) FOR CHANGING SPEED
    //double signalLeft = Robot.oi.operatorController.triggers.getLeft() * .5;
    //double signalRight = Robot.oi.operatorController.triggers.getRight();
    
    

    Robot.collector.collect(signal);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
