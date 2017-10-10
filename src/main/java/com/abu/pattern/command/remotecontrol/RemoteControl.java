package com.abu.pattern.command.remotecontrol;

import com.abu.pattern.command.remotecontrol.command.NoCommand;
//遥控器结构如下：
//\---------------------------\
//\			undoslot		  \
//\	light,CeilingFan,MACRO... \
//\	onslot1,onslot2,onslot3...\
//\	ofslot1,ofslot2,ofslot3...\
//\							  \
//\							  \
//\	--------------------------\
//解释：
//每当我们为一个遥控器设置接收者的命令时
//这个命令应该是开闭成对出现，并且落入对应的slot
//在RemoteControlTest中。
//		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//      remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//      remoteControl.setCommand(2, partyOnMacro, partyOffMacro);
//我们设置了这个遥控器拥有，启闭灯的开关按钮，启闭吊扇的开关按钮，以及同时启闭灯与吊扇的按钮
//我们未来还能为这个遥控器设置更多的启闭按钮。

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n===== Remote Control =====\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "\t" + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
