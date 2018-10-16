package com.ctc.strategy;

@FunctionalInterface
public interface Strategy {
    boolean test(Apple apple);
}
