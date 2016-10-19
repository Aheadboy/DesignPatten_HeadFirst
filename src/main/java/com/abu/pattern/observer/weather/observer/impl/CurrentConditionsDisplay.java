package com.abu.pattern.observer.weather.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.abu.pattern.observer.weather.observer.DisplayProgram;
import com.abu.pattern.observer.weather.observer.DisplayWeather;
import com.abu.pattern.observer.weather.subject.impl.TvData;
import com.abu.pattern.observer.weather.subject.impl.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayWeather, DisplayProgram {
	private Observable observable;
	
	private float temperature;
    private float humidity;
    
    private String programOne;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

    @Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			displayWeather();
		}
		if(obs instanceof TvData){
			TvData tvData = (TvData)obs;
			this.programOne = tvData.getChannelOneProgram();
			displayProgram();
		}
	}

	public void displayWeather() {
		System.out.println("Current conditions: " + temperature 
	            + "F degrees and " + humidity + "% humidity");
	}
	
	public void displayProgram() {
		System.out.println("CurrentConditionsDisplay like programOne, watching "+programOne+" now");
	}

}
