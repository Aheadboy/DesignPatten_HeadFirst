package com.abu.pattern.factory.fmethod;

import com.abu.pattern.factory.fmethod.pizza.ChicagoStyleCheesePizza;
import com.abu.pattern.factory.fmethod.pizza.ChicagoStyleClamPizza;
import com.abu.pattern.factory.simple.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new ChicagoStyleCheesePizza();
		}else if(type.equals("clam")){
			pizza = new ChicagoStyleClamPizza();
		}
		return pizza;
	}

}
