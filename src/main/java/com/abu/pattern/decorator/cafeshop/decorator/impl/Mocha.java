package com.abu.pattern.decorator.cafeshop.decorator.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;
import com.abu.pattern.decorator.cafeshop.decorator.CondimentDecorator;

/**
 * 饮料里面加抹茶
 * 是多少钱
 * commentByLjj
 */
public class Mocha extends CondimentDecorator {
 
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
 
    @Override
    public String getDescription() {
    	return beverage.getDescription() + ", Mocha";
    }
 
    @Override
    public double cost() {
    	double cost = beverage.cost();
    	if(getSize()==Beverage.SMALL){
    		cost += .15;
    	}else if(getSize()==Beverage.NORMAL){
    		cost += .20;
    	}else if(getSize()==Beverage.BIG){
    		cost += .25;
    	}
        return cost;
    }
}