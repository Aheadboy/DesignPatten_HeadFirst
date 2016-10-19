package com.abu.pattern.command.remotecontrol.receiver;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private String location;
	private int speed;
	
	public CeilingFan(String location){
		this.location = location;
		this.speed = OFF;
	}
	
	public void high(){
		System.out.println(location+" turn to high");
		this.speed = HIGH;
	}
	
	public void medium(){
		this.speed = MEDIUM;
	}
	
	public void low(){
		this.speed = LOW;
	}
	
	public void off(){
		System.out.println(location+" turn off");
		this.speed = OFF;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
}
