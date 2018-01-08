package com.abu.pattern.strategy_DI_ljj1.duck.behavior.impl;

import com.abu.pattern.strategy_DI_ljj1.duck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

}
