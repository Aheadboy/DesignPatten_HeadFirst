package com.abu.pattern.observer.weather.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.abu.pattern.observer.weather.observer.DisplayProgram;
import com.abu.pattern.observer.weather.observer.DisplayWeather;
import com.abu.pattern.observer.weather.subject.impl.TvData;
import com.abu.pattern.observer.weather.subject.impl.WeatherData;

public class ForecastDisplay implements Observer, DisplayWeather, DisplayProgram {
	private Observable observable;
	
	private float lastPressure;
	private float currentPressure = 20f;
	
	private String programTwo;
	
	public ForecastDisplay(Observable observable){
		this.observable = observable;
		this.observable.addObserver(this);
	}

    @Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			displayWeather();
		}
		if(obs instanceof TvData){
			TvData tvData = (TvData)obs;
			this.programTwo = tvData.getChannelTwoProgram();
			displayProgram();
		}
	}

	public void displayWeather() {
		System.out.println("Current pressure: "+currentPressure+" and last pressure: "+ lastPressure);
	}
	
	public void displayProgram() {
		System.out.println("ForecastDisplay like programTwo, watching "+programTwo+" now");
	}

}
