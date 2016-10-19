package com.abu.pattern.command.remotecontrol.command;

import com.abu.pattern.command.remotecontrol.Command;
import com.abu.pattern.command.remotecontrol.receiver.Light;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}

}
