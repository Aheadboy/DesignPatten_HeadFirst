package com.abu.pattern.template.beverage;

public abstract class CaffeineBeverage {
	
	public void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantCondiments()){
			addCondiments();
		}
	}
	
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	public boolean customerWantCondiments(){
		return true;
	}
}
