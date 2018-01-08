package com.abu.pattern.strategy_DI_ljj1.duck;

import com.abu.pattern.strategy_DI_ljj1.duck.base.Duck;
import com.abu.pattern.strategy_DI_ljj1.duck.behavior.impl.FlyWithWings;
import com.abu.pattern.strategy_DI_ljj1.duck.behavior.impl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
