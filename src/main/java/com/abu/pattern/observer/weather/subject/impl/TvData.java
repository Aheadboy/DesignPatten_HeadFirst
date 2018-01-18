package com.abu.pattern.observer.weather.subject.impl;

import java.util.Observable;

public class TvData extends Observable {
    private String channelOneProgram;//节目
    private String channelTwoProgram;
    
    public TvData() {}
    
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    
    public void setPrograms(String programForChannelOne, String programForChannelTwo) {
        this.channelOneProgram = programForChannelOne;
        this.channelTwoProgram = programForChannelTwo;
        measurementsChanged();
    }

	public String getChannelOneProgram() {
		return channelOneProgram;
	}

	public String getChannelTwoProgram() {
		return channelTwoProgram;
	}
    
}
