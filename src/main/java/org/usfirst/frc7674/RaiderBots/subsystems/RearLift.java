/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7674.RaiderBots.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc7674.RaiderBots.commands.ElevatorDrive;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class RearLift extends Subsystem {
  private AnalogInput rearLiftPot;
  private WPI_TalonSRX rearLiftLead;
  private WPI_TalonSRX rearLiftFollow;


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public RearLift(){
    rearLiftLead = new WPI_TalonSRX(8);
    rearLiftFollow = new WPI_TalonSRX(9);

    rearLiftFollow.follow(rearLiftLead);
    this.rearLiftPot = new AnalogInput(1);

  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ElevatorDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public double getPosition() {
    return rearLiftPot.getAverageVoltage();
  }

  public void rearLiftDrive(double speed){
    rearLiftLead.set(ControlMode.PercentOutput, .5 * speed);
  }

}
