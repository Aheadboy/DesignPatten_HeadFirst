package com.abu.pattern.factory.fmethod;

import com.abu.pattern.factory.fmethod.pizza.NYStyleCheesePizza;
import com.abu.pattern.factory.fmethod.pizza.NYStyleClamPizza;
import com.abu.pattern.factory.simple.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new NYStyleCheesePizza();
		}else if(type.equals("clam")){
			pizza = new NYStyleClamPizza();
		}
		return pizza;
	}

}
