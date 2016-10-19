package com.abu.pattern.strategy.duck.behavior.impl;

import com.abu.pattern.strategy.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{
	
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
