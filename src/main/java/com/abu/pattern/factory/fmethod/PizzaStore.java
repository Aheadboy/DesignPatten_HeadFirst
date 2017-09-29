package com.abu.pattern.factory.fmethod;

import com.abu.pattern.factory.simple.Pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}


	/**
	 * 不同的处理逻辑，不同的产品
	 * @param type
	 * @return
	 */
	abstract Pizza createPizza(String type);
}
