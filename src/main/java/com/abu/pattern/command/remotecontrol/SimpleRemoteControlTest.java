package com.abu.pattern.command.remotecontrol;

import com.abu.pattern.command.remotecontrol.command.LightOnCommand;
import com.abu.pattern.command.remotecontrol.receiver.Light;

public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light("Bedroom Light");
		Command lightOnCommand = new LightOnCommand(light);
		
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonPressed();
	}

}
