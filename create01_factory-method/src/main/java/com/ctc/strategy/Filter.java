package com.ctc.strategy;

import java.util.List;

public  class Filter {

    private Strategy strategy;

    public Filter(Strategy strategy) {
        this.strategy = strategy;
    }

    public void excute(List<Apple> apples){
        for (Apple apple : apples) {
            if (strategy.test(apple)) {
                System.out.println(apple);
            }
        }
    }
}

