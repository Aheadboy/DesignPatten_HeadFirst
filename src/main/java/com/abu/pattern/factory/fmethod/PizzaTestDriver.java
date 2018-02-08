package com.abu.pattern.factory.fmethod;

import com.abu.pattern.factory.simple.Pizza;

public class PizzaTestDriver {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chStore = new ChicagoPizzaStore();

		//这里使用父类引用而不是具体类。体现了多态。或里氏替换原则。
		//有解耦的效果。
		Pizza pizza = nyStore.orderPizza("clam");
		System.out.println(pizza.getName()+" Ready");
		pizza = chStore.orderPizza("cheese");
		System.out.println(pizza.getName()+" Ready");
	}

}
