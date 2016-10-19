package com.abu.pattern.command.remotecontrol;

/**
 * Command 接口类
 *
 */
public interface Command {
	void execute();
	
	void undo();
}
