package com.ctc.observe.generic;

import org.junit.Test;

public class APP {

    @Test
    public void genericTest(){
        GWeather gWeather = new GWeather();
        gWeather.addObserver(new GOrcsObserver());
        gWeather.addObserver(new GHobbitObserver());

        gWeather.timePassBy();
        gWeather.timePassBy();
        gWeather.timePassBy();
        gWeather.timePassBy();
    }
}

