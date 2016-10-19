package com.abu.pattern.decorator.cafeshop.component;

public abstract class Beverage {
	public final static int SMALL = 1;
	public final static int NORMAL = 2;
	public final static int BIG = 3;
	
	protected String description = "Unknown Beverage";
	
	protected int size = 2;

	public String getDescription() {
		return description;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}

	public abstract double cost();
}