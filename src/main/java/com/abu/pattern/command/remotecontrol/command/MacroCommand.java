package com.abu.pattern.command.remotecontrol.command;

import com.abu.pattern.command.remotecontrol.Command;

public class MacroCommand implements Command {
	
	private Command[] commands;
	
	public MacroCommand(Command[] commands){
		this.commands = commands;
	}

	public void execute() {
		for(int i=0;i<commands.length;i++){
			commands[i].execute();
		}
	}

	public void undo() {
		for(int i=0;i<commands.length;i++){
			commands[i].undo();
		}
	}

}
