package com.abu.pattern.factory.abstractf.ingredient;

import com.abu.pattern.factory.abstractf.PizzaIngredientFactory;
import com.abu.pattern.factory.abstractf.material.Cheese;
import com.abu.pattern.factory.abstractf.material.Clam;
import com.abu.pattern.factory.abstractf.material.Dough;
import com.abu.pattern.factory.abstractf.material.Sauce;
import com.abu.pattern.factory.abstractf.material.impl.NYCheese;
import com.abu.pattern.factory.abstractf.material.impl.NYClam;
import com.abu.pattern.factory.abstractf.material.impl.NYDough;
import com.abu.pattern.factory.abstractf.material.impl.NYSauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new NYDough();
	}

	public Sauce createSauce() {
		return new NYSauce();
	}

	public Cheese createCheese() {
		return new NYCheese();
	}

	public Clam createClam() {
		return new NYClam();
	}

}
