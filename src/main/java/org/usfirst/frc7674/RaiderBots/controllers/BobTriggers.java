package org.usfirst.frc7674.RaiderBots.controllers;

import org.usfirst.frc7674.RaiderBots.controllers.BobXboxController.XboxAxis;

import edu.wpi.first.wpilibj.Joystick;

public class BobTriggers {
	Joystick controller;

	public BobTriggers(Joystick controller) {
		this.controller = controller;
	}

	public double getLeft() {
		return this.controller.getRawAxis(XboxAxis.LEFT_TRIGGER.value);
	}

	public double getRight() {
		return this.controller.getRawAxis(XboxAxis.RIGHT_TRIGGER.value);
	}

	public double getTwist() {
		return (-getLeft()) + getRight();
	}
}
