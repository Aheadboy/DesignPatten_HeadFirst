package com.abu.pattern.factory.fmethod.pizza;

import com.abu.pattern.factory.simple.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza(){
		this.name = "Chicago Style Clam Pizza";
		this.dough = "Thin Curst Dough";
		this.sauce = "Tomato Sauce";
		this.toppings.add("Chicago Clam");
	}
}
