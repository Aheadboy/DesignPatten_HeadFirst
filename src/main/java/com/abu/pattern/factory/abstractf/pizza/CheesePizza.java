package com.abu.pattern.factory.abstractf.pizza;

import com.abu.pattern.factory.abstractf.AbsPizza;
import com.abu.pattern.factory.abstractf.PizzaIngredientFactory;

public class CheesePizza extends AbsPizza {
	
	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing Pizza:"+name);
		
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
	}

}
