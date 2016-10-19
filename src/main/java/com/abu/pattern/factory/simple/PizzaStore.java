package com.abu.pattern.factory.simple;

public class PizzaStore {
	
	public Pizza orderPizza(String pizzaType){
		Pizza pizza = SimplePizzaFactory.createPizza(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
