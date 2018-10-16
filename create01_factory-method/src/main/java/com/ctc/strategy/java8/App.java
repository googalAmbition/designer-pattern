package com.ctc.strategy.java8;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

    private List<Apple> apples;

    @Before
    public void before() {
        apples = Arrays.asList(
                new Apple(50, Color.BROWN),
                new Apple(100, Color.BROWN),
                new Apple(150, Color.RED),
                new Apple(110, Color.GREEN),
                new Apple(60, Color.GREEN)
        );
    }

    /**
     * 常规测试
     */
    @Test
    public void java8Test() {
        excute(apples, apple -> {
            return apple.getColor().equals(Color.GREEN);
        });
    }

    public static void excute(List<Apple> apples, Predicate<Apple> predicate) {
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                System.out.println(apple);
            }
        }
    }


}

