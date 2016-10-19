package com.abu.pattern.factory.abstractf;

import com.abu.pattern.factory.abstractf.material.Cheese;
import com.abu.pattern.factory.abstractf.material.Clam;
import com.abu.pattern.factory.abstractf.material.Dough;
import com.abu.pattern.factory.abstractf.material.Sauce;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	
	public Sauce createSauce();
	
	public Cheese createCheese();
	
	public Clam createClam();
}
