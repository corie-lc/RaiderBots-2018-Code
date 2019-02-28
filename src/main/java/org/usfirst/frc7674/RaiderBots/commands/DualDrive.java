/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7674.RaiderBots.commands;
import org.usfirst.frc7674.RaiderBots.Robot;
import org.usfirst.frc7674.RaiderBots.subsystems.Elevator;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.command.Command;

public class DualDrive extends Command {
  public DualDrive() {
    requires(Robot.frontLift);
    requires(Robot.rearLift);

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
    double signal = Robot.oi.operatorController.rightStick.getY();
    Robot.frontLift.frontLiftDrive(signal);
    Robot.rearLift.rearLiftDrive(signal);
    
    double currentVoltageRearLift = new WPI_TalonSRX(8).getMotorOutputVoltage();
    System.out.println("Current Voltage Rear Lift(On Dual): " + currentVoltageRearLift);
    double currentVoltageFrontLift = new WPI_TalonSRX(10).getMotorOutputVoltage();
    System.out.println("Current Voltage Front Lift(On Dual): " + currentVoltageFrontLift);
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
