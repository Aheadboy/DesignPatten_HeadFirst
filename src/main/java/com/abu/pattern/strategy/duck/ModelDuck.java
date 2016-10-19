package com.abu.pattern.strategy.duck;

import com.abu.pattern.strategy.duck.base.Duck;
import com.abu.pattern.strategy.duck.behavior.impl.FlyNoWay;
import com.abu.pattern.strategy.duck.behavior.impl.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
