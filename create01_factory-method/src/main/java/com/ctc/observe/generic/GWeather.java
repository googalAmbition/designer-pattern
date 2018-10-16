package com.ctc.observe.generic;

import com.ctc.observe.WeatherType;

import java.text.MessageFormat;

public class GWeather extends Observable<GWeather,Race,WeatherType> {

    private WeatherType currentWeather;

    public GWeather(){
        currentWeather = WeatherType.SUNNY;
    }

    public void timePassBy(){
        WeatherType[] enumsValues = WeatherType.values();
        currentWeather = enumsValues[(currentWeather.ordinal()+1)%enumsValues.length];
        System.out.println(MessageFormat.format("The weather change to {0}",currentWeather));
        notifyObserver(currentWeather);
    }


}

