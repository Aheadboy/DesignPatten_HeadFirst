package com.abu.pattern.template.beverage.impl;

import com.abu.pattern.template.beverage.CaffeineBeverage;


public class CoffeeWithoutCondiments extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Droping coffee with filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	@Override
	public boolean customerWantCondiments(){
		return false;
	} 

}
