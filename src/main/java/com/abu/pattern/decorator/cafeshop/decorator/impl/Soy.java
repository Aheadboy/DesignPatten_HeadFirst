package com.abu.pattern.decorator.cafeshop.decorator.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;
import com.abu.pattern.decorator.cafeshop.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
 
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
 
    @Override
    public String getDescription() {
    	return beverage.getDescription() + ", Soy";
    }
 
    @Override
    public double cost() {
    	double cost = beverage.cost();
    	if(getSize()==Beverage.SMALL){
    		cost += .10;
    	}else if(getSize()==Beverage.NORMAL){
    		cost += .15;
    	}else if(getSize()==Beverage.BIG){
    		cost += .20;
    	}
        return cost;
    }
}