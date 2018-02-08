package com.abu.pattern.factory.simple;

/**
 * 提供一个静态方法，专门用于创建其他对象。
 * 根据不同的参数pizzaType，创建不同的对象。
 * 被创建的实例通常都具有共同的父类。
 */
public class SimplePizzaFactory {
	public static Pizza createPizza(String pizzaType){
		Pizza pizza = new Pizza(){};
		return pizza;
	}
}
