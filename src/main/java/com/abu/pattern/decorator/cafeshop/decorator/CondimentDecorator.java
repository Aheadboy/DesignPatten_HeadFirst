package com.abu.pattern.decorator.cafeshop.decorator;

import com.abu.pattern.decorator.cafeshop.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	@Override
	public abstract String getDescription();
	
	@Override
	public int getSize(){
		return beverage.getSize();
	}
	
	@Override
	public void setSize(int size){
		beverage.setSize(size);
	}
}