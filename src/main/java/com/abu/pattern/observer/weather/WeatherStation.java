package com.abu.pattern.observer.weather;

import com.abu.pattern.observer.weather.observer.impl.CurrentConditionsDisplay;
import com.abu.pattern.observer.weather.observer.impl.ForecastDisplay;
import com.abu.pattern.observer.weather.observer.impl.StatisticsDisplay;
import com.abu.pattern.observer.weather.subject.impl.TvData;
import com.abu.pattern.observer.weather.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
    	// Push
        WeatherData weatherData = new WeatherData();//被监听对象
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);//观察者
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);//观察者
        weatherData.setMeasurements(80, 65, 30.4f);
        //weatherData.setMeasurements(82, 70, 29.2f);
        //weatherData.setMeasurements(78, 90, 29.2f);
        
        // Pull
//        TvData tvData = new TvData();
//        tvData.setPrograms("24hours", "Lost");
//        currentDisplay.update(tvData, null);
        
        System.out.println("=END=");
    }
}