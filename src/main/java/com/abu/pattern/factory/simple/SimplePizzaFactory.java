package com.abu.pattern.factory.simple;

public class SimplePizzaFactory {
	public static Pizza createPizza(String pizzaType){
		Pizza pizza = new Pizza(){};
		return pizza;
	}
}
