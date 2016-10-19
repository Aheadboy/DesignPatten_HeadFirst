package com.abu.pattern.command.remotecontrol;

import com.abu.pattern.command.remotecontrol.command.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl(){
		onCommands = new Command[3];
		offCommands = new Command[3];
		
		Command noCommand = new NoCommand();
		for(int i=0;i<onCommands.length;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n===== Remote Control =====\n");
		for(int i=0;i<onCommands.length;i++){
			stringBuff.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"\t"+ offCommands[i].getClass().getName()+"\n");
		}
		return stringBuff.toString();
	}
}
