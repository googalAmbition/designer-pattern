package com.ctc.observe;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Weather {

    private WeatherType currentWeather;
    private List<WeatherObserve> observes;

    public Weather(){
        currentWeather = WeatherType.SUNNY;
        observes = new ArrayList<>();
    }

    public void addObserver(WeatherObserve observe){
        observes.add(observe);
    }

    public void removeObserver(WeatherObserve observe){
        observes.remove(observe);
    }

    public void timePassBy(){
        WeatherType[] types = WeatherType.values();
        currentWeather = types[(currentWeather.ordinal()+1)%types.length];
        System.out.println(MessageFormat.format("The weather change to {0}",currentWeather));
        notifyObservers();
    }

    private void notifyObservers(){
        for (WeatherObserve observe : observes){
            observe.update(currentWeather);
        }
    }
}

