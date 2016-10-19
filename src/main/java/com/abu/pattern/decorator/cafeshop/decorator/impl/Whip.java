package com.abu.pattern.decorator.cafeshop.decorator.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;
import com.abu.pattern.decorator.cafeshop.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
 
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
 
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
 
    @Override
    public double cost() {
    	double cost = beverage.cost();
    	if(getSize()==Beverage.SMALL){
    		cost += .05;
    	}else if(getSize()==Beverage.NORMAL){
    		cost += .10;
    	}else if(getSize()==Beverage.BIG){
    		cost += .15;
    	}
        return cost;
    }
}