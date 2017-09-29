package com.abu.pattern.factory.abstractf.store;

import com.abu.pattern.factory.abstractf.AbsPizza;
import com.abu.pattern.factory.abstractf.AbsPizzaStore;
import com.abu.pattern.factory.abstractf.PizzaIngredientFactory;
import com.abu.pattern.factory.abstractf.ingredient.NYPizzaIngredientFactory;
import com.abu.pattern.factory.abstractf.pizza.CheesePizza;
import com.abu.pattern.factory.abstractf.pizza.ClamPizza;


/**
 * 作为工厂方法类的子类。
 * 该类封装了，决定实例化何种产品的逻辑。
 */
public class NYPizzaStore extends AbsPizzaStore{

	@Override
	public AbsPizza createPizza(String type) {
		AbsPizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NY Cheese Pizza");
		}else if(type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("NY Clam Pizza");
		}
		return pizza;
	}

}
