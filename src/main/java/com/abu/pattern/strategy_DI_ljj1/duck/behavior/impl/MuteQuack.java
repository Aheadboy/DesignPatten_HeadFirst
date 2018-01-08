package com.abu.pattern.strategy_DI_ljj1.duck.behavior.impl;

import com.abu.pattern.strategy_DI_ljj1.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
