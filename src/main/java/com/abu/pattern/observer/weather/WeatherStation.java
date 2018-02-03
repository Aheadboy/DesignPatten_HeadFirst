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

/**
 *  情形：
 *  存在被观察者（Obserable）与观察者（Observer（s））。
 *  观察者会根据被观察者的变化而变化。
 *
 *  实现方式：
 *  Obserable维护一个集合，这个集合存放Observer
 *  通过注册与取消注册的方式，增删集合中的Observer
 *  当Obserable有变化时，Obserable负责遍历这个集合中的Observer并向其发送state更新，信号。
 *  ConcreteObserver将会持有ConcreteObserable的引用，以便读取ConcreteObserable中的最新信息。（往往Obserable向Observer发送信号的那个方法会带有Obserable的实例作为参数传给Observer例如：void update(Observable o, Object arg);）
 *
 *  使用：
 *  Obserable，encapsulate 了通知Observer的行为。
 *  Observer ，封装了观察到更新后的响应行为。
 *
 *  客户端代码所要做的主要是：
 *  1、增删Observer；
 *  2、更新Obserable的状态；
 *
 *
 *  Java 内置
 *      被观察者，维护观察者集合，当状态更新时，要调用  setChanged();notifyObservers();通知是线程安全的。
 *      观察者接受一个被观察者的引用。
 *  Android 内置
 *
 */