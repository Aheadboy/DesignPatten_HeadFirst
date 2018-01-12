package com.abu.pattern.command.remotecontrol.command;

import com.abu.pattern.command.remotecontrol.Command;


/**
 * 宏命令又称为组合命令，它是命令模式和组合模式联用的产物。
 *
 * 我个人称这个命令为组命令。（网络上称，宏命令，组合命令）
 * 因为它定义了一组命令。
 * 在实际场景中，将同时开闭（或说是操作）多个接受者对象。
 * <p>
 * 组命令里面可以包含单个命令，也可以包含组命令。
 * 执行一个宏命令将执行多个具体命令，从而实现对命令的批处理
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }

}
