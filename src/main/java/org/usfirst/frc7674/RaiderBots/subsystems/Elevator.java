// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7674.RaiderBots.subsystems;


import org.usfirst.frc7674.RaiderBots.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;



/**
 *
 */
public class Elevator extends Subsystem {

    private WPI_VictorSPX elevatorMotor;
    private AnalogInput elevatorPot;
    

    public Elevator() {
        elevatorMotor = new WPI_VictorSPX(5);
        elevatorPot = new AnalogInput(0);
        
        
    }

    @Override
    public void initDefaultCommand() {

        setDefaultCommand(new Roll());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public double getPosition(){
        return elevatorPot.getAverageVoltage();
    }

    public void roll(double speed){
        elevatorMotor.set(speed);
    }

    
}

