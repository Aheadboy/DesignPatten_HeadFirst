package com.abu.pattern.decorator.cafeshop.component.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;

/**
 * 深焙, ph > 5.5
 * @author Administrator
 *
 */
public class DarkRoast extends Beverage {
  
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
  
    @Override
    public double cost() {
    	double cost = 0;
    	if(size==Beverage.SMALL){
    		cost = .79;
    	}else if(size==Beverage.NORMAL){
    		cost = .99;
    	}else if(size==Beverage.BIG){
    		cost = 1.19;
    	}
        return cost;
    }
}