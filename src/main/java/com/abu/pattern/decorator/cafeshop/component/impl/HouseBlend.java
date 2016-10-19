package com.abu.pattern.decorator.cafeshop.component.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;

/**
 * 综合,Starbuck特色
 * @author Administrator
 *
 */
public class HouseBlend extends Beverage {
	
    public HouseBlend() {
        description = "House Blend Coffee";
    }
 
    @Override
    public double cost() {
    	double cost = 0;
    	if(size==Beverage.SMALL){
    		cost = .69;
    	}else if(size==Beverage.NORMAL){
    		cost = .89;
    	}else if(size==Beverage.BIG){
    		cost = 1.09;
    	}
        return cost;
    }
}