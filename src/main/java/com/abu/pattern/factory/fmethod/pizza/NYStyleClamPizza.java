package com.abu.pattern.factory.fmethod.pizza;

import com.abu.pattern.factory.simple.Pizza;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza(){
		this.name = "NY Style Clam Pizza";
		this.dough = "Thin Curst Dough";
		this.sauce = "Marinara Sauce";
		this.toppings.add("NY Clam");
	}
}
