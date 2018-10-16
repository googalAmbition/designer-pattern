package com.ctc.strategy;

public class WeightStrategy implements Strategy {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 100;
    }
}

