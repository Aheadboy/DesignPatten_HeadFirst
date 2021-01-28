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
        //初始化遥控器
        RemoteControl remoteControl = new RemoteControl();

        //初始化灯，以及控制灯的命令
        Light livingRoomLight = new Light("Living Room Light");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        //初始化吊扇，以及控制吊扇的命令
        CeilingFan ceilingFan = new CeilingFan("Living Room CeilingFan");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        //初始化组命令（宏命令）MacroCommand，该命令将启闭多个接受对象，而不是一个；
        Command[] partyOn = {livingRoomLightOn, ceilingFanHigh};
        Command[] partyOff = {livingRoomLightOff, ceilingFanOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        //将初始化完毕的命令对象，设置进遥控器。
        //在完成这个步骤前，遥控器是存在的，但是按钮是不存在的。（这是很粗暴的理解，当然没有太大毛病）
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(2, partyOnMacro, partyOffMacro);

        //使用遥控器
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.undoButtonWasPushed();
    }

}
/***
 * Living Room Light is on
 * Living Room Light is off
 * Living Room CeilingFan turn to high
 * Living Room CeilingFan turn off
 * Living Room Light is on
 * Living Room CeilingFan turn to high
 *
 * Living Room Light is off
 * Living Room CeilingFan turn off
 * Living Room Light is on
 * Living Room CeilingFan turn to high
 */

/**
 * 情景：
 * `命令封装了对接受者的操作、以及撤销；
 *
 */
