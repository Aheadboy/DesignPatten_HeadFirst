package com.abu.pattern.command.remotecontrol.command;

import com.abu.pattern.command.remotecontrol.Command;

public class NoCommand implements Command {

	public void execute() {
		System.out.println("NoCommand do nothing");
	}

	public void undo() {
		System.out.println("NoCommand do nothing");
	}

}
