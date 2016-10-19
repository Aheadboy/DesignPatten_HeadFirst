package com.abu.pattern.factory.abstractf;

import com.abu.pattern.factory.abstractf.store.ChicagoPizzaStore;
import com.abu.pattern.factory.abstractf.store.NYPizzaStore;

public class PizzaTestDriver {

	public static void main(String[] args) {
		
		AbsPizzaStore nyStore = new NYPizzaStore();
		AbsPizzaStore chStore = new ChicagoPizzaStore();
		
		AbsPizza pizza = nyStore.orderPizza("clam");
		System.out.println(pizza.getName()+" Ready");
		pizza = chStore.orderPizza("cheese");
		System.out.println(pizza.getName()+" Ready");
	}

}
