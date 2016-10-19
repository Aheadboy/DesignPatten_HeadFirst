package com.abu.pattern.decorator.cafeshop.component.impl;

import com.abu.pattern.decorator.cafeshop.component.Beverage;

/**
 * 低咖啡因
 * @author Administrator
 *
 */
public class Decaf extends Beverage {
  
    public Decaf() {
        description = "Decaf";
    }
  
    @Override
    public double cost() {
    	double cost = 0;
    	if(size==Beverage.SMALL){
    		cost = .85;
    	}else if(size==Beverage.NORMAL){
    		cost = 1.05;
    	}else if(size==Beverage.BIG){
    		cost = 1.25;
    	}
        return cost;
    }
}