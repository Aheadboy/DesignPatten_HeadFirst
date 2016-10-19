package com.abu.pattern.factory.fmethod;

import com.abu.pattern.factory.simple.Pizza;

public class PizzaTestDriver {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("clam");
		System.out.println(pizza.getName()+" Ready");
		pizza = chStore.orderPizza("cheese");
		System.out.println(pizza.getName()+" Ready");
	}

}
