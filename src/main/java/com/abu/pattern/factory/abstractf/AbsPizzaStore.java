package com.abu.pattern.factory.abstractf;

public abstract class AbsPizzaStore {
	
	public AbsPizza orderPizza(String type){
		AbsPizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract AbsPizza createPizza(String type);
}
