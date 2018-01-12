package com.abu.pattern.command.remotecontrol;

import com.abu.pattern.command.remotecontrol.command.LightOnCommand;
import com.abu.pattern.command.remotecontrol.receiver.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        //初始化遥控器
        //请求发送者，commmand sender
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        //初始化灯，以及控制灯的命令
        //请求接受者 commmand reciver
        Light light = new Light("Bedroom Light");
        //command
        Command lightOnCommand = new LightOnCommand(light);

        //将初始化完毕的命令对象，设置进遥控器。
        simpleRemoteControl.setCommand(lightOnCommand);
        //使用遥控器
        simpleRemoteControl.buttonPressed();
    }

}
