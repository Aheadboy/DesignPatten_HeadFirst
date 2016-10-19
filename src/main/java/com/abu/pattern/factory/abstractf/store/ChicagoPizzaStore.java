package com.abu.pattern.factory.abstractf.store;

import com.abu.pattern.factory.abstractf.AbsPizza;
import com.abu.pattern.factory.abstractf.AbsPizzaStore;
import com.abu.pattern.factory.abstractf.PizzaIngredientFactory;
import com.abu.pattern.factory.abstractf.ingredient.ChicagoPizzaIngredientFactory;
import com.abu.pattern.factory.abstractf.pizza.CheesePizza;
import com.abu.pattern.factory.abstractf.pizza.ClamPizza;

public class ChicagoPizzaStore extends AbsPizzaStore{

	@Override
	public AbsPizza createPizza(String type) {
		AbsPizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Cheese Pizza");
		}else if(type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Clam Pizza");
		}
		return pizza;
	}

}
