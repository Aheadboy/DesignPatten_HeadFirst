package com.abu.pattern.facade.hometheater;

public class HomeTheaterTest {
	
	public static void main(String args[]){
		HomeTheaterFacade facade = new HomeTheaterFacade(new Amplifier(), new DvdPlayer(), new Screen());
		facade.watchMovie();
	}
}
