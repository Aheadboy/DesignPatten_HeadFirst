package com.abu.pattern.decorator.cafeshop.component.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;

/**
 * 浓缩, like Latte,Cappuccino
 * @author Administrator
 *
 */
public class Espresso extends Beverage {
  
    public Espresso() {
        description = "Espresso";
    }
  
    @Override
    public double cost() {
    	double cost = 0;
    	if(size==Beverage.SMALL){
    		cost = 1.79;
    	}else if(size==Beverage.NORMAL){
    		cost = 1.99;
    	}else if(size==Beverage.BIG){
    		cost = 2.19;
    	}
        return cost;
    }
}