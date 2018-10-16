package com.ctc.bridge;

public class Circle implements Shape {

    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void apply() {
        this.color.colour();
        System.out.println("圆做轮子");
    }

}

