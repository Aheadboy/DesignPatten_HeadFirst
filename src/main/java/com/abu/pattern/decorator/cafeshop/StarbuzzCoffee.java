package com.abu.pattern.decorator.cafeshop;

import com.abu.pattern.decorator.cafeshop.component.Beverage;
import com.abu.pattern.decorator.cafeshop.component.impl.DarkRoast;
import com.abu.pattern.decorator.cafeshop.component.impl.Espresso;
import com.abu.pattern.decorator.cafeshop.component.impl.HouseBlend;
import com.abu.pattern.decorator.cafeshop.decorator.impl.Mocha;
import com.abu.pattern.decorator.cafeshop.decorator.impl.Soy;
import com.abu.pattern.decorator.cafeshop.decorator.impl.Whip;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		beverage.setSize(Beverage.SMALL);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2.setSize(Beverage.BIG);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3.setSize(Beverage.BIG);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}