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
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Pneumatics extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Compressor compressor;
    private DoubleSolenoid collectorSolenoid;
    private DoubleSolenoid elevatorSolenoid;
    private DoubleSolenoid solenoidThree;
    private DoubleSolenoid solenoidFour;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Pneumatics() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        compressor = new Compressor(1);
        addChild("compressor",compressor);
        
        
        collectorSolenoid = new DoubleSolenoid(1, 0, 1);
        addChild("collectorSoleniod",collectorSolenoid);
        
        
        elevatorSolenoid = new DoubleSolenoid(1, 2, 3);
        addChild("ElevatorSoleniod",elevatorSolenoid);

        solenoidThree = new DoubleSolenoid(1, 4, 5);
        addChild("soleniodThree", solenoidThree);

        solenoidFour = new DoubleSolenoid(1, 6, 7);
        addChild("soleniodFour", solenoidFour);


        
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new CompressorRun());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
public void extendSolenoidFour(boolean extend){
    if(extend){
        this.solenoidFour.set(Value.kForward);
    } else{
        this.solenoidFour.set(Value.kReverse);
    }
}

public void extendSolenoidThree(boolean extend){
    if(extend){
        this.solenoidThree.set(Value.kForward);
    } else{
        this.solenoidThree.set(Value.kReverse);
    }
}

public void extendElevatorSolenoid(boolean extend){
    if(extend){
        this.elevatorSolenoid.set(Value.kForward);
    } else{
        this.elevatorSolenoid.set(Value.kReverse);
    }
}


}
