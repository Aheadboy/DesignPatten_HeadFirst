package com.abu.pattern.factory.abstractf.ingredient;

import com.abu.pattern.factory.abstractf.PizzaIngredientFactory;
import com.abu.pattern.factory.abstractf.material.Cheese;
import com.abu.pattern.factory.abstractf.material.Clam;
import com.abu.pattern.factory.abstractf.material.Dough;
import com.abu.pattern.factory.abstractf.material.Sauce;
import com.abu.pattern.factory.abstractf.material.impl.ChicagoCheese;
import com.abu.pattern.factory.abstractf.material.impl.ChicagoClam;
import com.abu.pattern.factory.abstractf.material.impl.ChicagoDough;
import com.abu.pattern.factory.abstractf.material.impl.ChicagoSauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ChicagoDough();
	}

	public Sauce createSauce() {
		return new ChicagoSauce();
	}

	public Cheese createCheese() {
		return new ChicagoCheese();
	}

	public Clam createClam() {
		return new ChicagoClam();
	}

}
