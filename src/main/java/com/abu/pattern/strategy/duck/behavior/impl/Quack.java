package com.abu.pattern.strategy.duck.behavior.impl;

import com.abu.pattern.strategy.duck.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("Quack");
	}

}
