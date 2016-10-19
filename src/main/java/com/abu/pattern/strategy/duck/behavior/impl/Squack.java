package com.abu.pattern.strategy.duck.behavior.impl;

import com.abu.pattern.strategy.duck.behavior.QuackBehavior;

public class Squack implements QuackBehavior {

	public void quack() {
		System.out.println("Squack");
	}

}
