/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7674.RaiderBots.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc7674.RaiderBots.commands.FrontLiftElevator;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FrontLift extends Subsystem 
{
  private WPI_TalonSRX frontLiftLead;
  private WPI_TalonSRX frontLiftFollow;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public FrontLift(){
    frontLiftLead = new WPI_TalonSRX(10);
    frontLiftFollow = new WPI_TalonSRX(11);
    frontLiftFollow.follow(frontLiftLead);
    frontLiftLead.setInverted(true);
    
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new FrontLiftElevator());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void frontLiftDrive(double speed){
    frontLiftLead.set(ControlMode.PercentOutput, .5 * speed);
  }
  

  }

