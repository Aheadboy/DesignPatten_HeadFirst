package com.abu.pattern.factory.fmethod.pizza;

import com.abu.pattern.factory.simple.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza(){
		this.name = "Chicago Style Cheese Pizza";
		this.dough = "Thin Curst Dough";
		this.sauce = "Tomato Sauce";
		this.toppings.add("Chicago Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
