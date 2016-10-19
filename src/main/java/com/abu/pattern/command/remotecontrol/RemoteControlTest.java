package com.abu.pattern.command.remotecontrol;

import com.abu.pattern.command.remotecontrol.command.CeilingFanHighCommand;
import com.abu.pattern.command.remotecontrol.command.CeilingFanOffCommand;
import com.abu.pattern.command.remotecontrol.command.LightOffCommand;
import com.abu.pattern.command.remotecontrol.command.LightOnCommand;
import com.abu.pattern.command.remotecontrol.command.MacroCommand;
import com.abu.pattern.command.remotecontrol.receiver.CeilingFan;
import com.abu.pattern.command.remotecontrol.receiver.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room Light");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		CeilingFan ceilingFan = new CeilingFan("Living Room CeilingFan");
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		Command[] partyOn = {livingRoomLightOn, ceilingFanHigh};
		Command[] partyOff = {livingRoomLightOff, ceilingFanOff};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(2, partyOnMacro, partyOffMacro);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		remoteControl.undoButtonWasPushed();
	}

}
