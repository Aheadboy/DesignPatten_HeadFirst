package com.abu.pattern.template.beverage;

import com.abu.pattern.template.beverage.impl.CoffeeWithoutCondiments;

public class CaffeineBeverageTest {
	
	public static void main(String[] args) {
		CaffeineBeverage beverage = new CoffeeWithoutCondiments();
		beverage.prepareRecipe();
	}

}
