package com.abu.pattern.facade.hometheater;

public class HomeTheaterFacade {
	private Amplifier amp;
	private DvdPlayer dvd;
	private Screen screen;
	
	public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Screen screen){
		this.amp = amplifier;
		this.dvd = dvdPlayer;
		this.screen = screen;	
	}
	
	public void watchMovie(){
		System.out.println("Get ready to watch a movie...");
		screen.down();
		amp.on();
		amp.setDvd();
		dvd.on();
	}
}
