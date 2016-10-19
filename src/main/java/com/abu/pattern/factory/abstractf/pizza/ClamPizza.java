package com.abu.pattern.factory.abstractf.pizza;

import com.abu.pattern.factory.abstractf.AbsPizza;
import com.abu.pattern.factory.abstractf.PizzaIngredientFactory;

public class ClamPizza extends AbsPizza {
	
	private PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing Pizza:"+name);
		
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.clam = ingredientFactory.createClam();
	}

}
