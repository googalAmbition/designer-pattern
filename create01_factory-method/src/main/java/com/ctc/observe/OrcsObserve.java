package com.ctc.observe;

public class OrcsObserve implements WeatherObserve{
    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                System.out.println("The orcs are shivering in the cold weather.");
                break;
            case RAINY:
                System.out.println("The orcs look for cover from the rain.");
                break;
            case SUNNY:
                System.out.println("The orcs hobbits bade in the warm sun.");
                break;
            case WINDY:
                System.out.println("The orcs hold their hats tightly in the windy weather.");
                break;
            default:
                break;
        }
    }
}

