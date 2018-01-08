package com.abu.pattern.strategy_DI_ljj1.duck.base;

import com.abu.pattern.strategy_DI_ljj1.duck.behavior.FlyBehavior;
import com.abu.pattern.strategy_DI_ljj1.duck.behavior.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFLy(){
		flyBehavior.fly();
	}
	
	public void swim(){
		System.out.println("Evert duck can swim");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
}
