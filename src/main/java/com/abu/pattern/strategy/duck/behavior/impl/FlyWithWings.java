package com.abu.pattern.strategy.duck.behavior.impl;

import com.abu.pattern.strategy.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying");
	}

}
