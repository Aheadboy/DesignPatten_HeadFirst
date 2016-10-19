package com.abu.pattern.command.remotecontrol.command;

import com.abu.pattern.command.remotecontrol.Command;
import com.abu.pattern.command.remotecontrol.receiver.Light;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}

}
