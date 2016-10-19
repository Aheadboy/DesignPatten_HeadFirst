package com.abu.pattern.factory.fmethod.pizza;

import com.abu.pattern.factory.simple.Pizza;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza(){
		this.name = "NY Style Cheese Pizza";
		this.dough = "Thin Curst Dough";
		this.sauce = "Marinara Sauce";
		this.toppings.add("NY Cheese");
	}
}
