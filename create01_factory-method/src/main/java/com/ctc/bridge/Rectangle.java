package com.ctc.bridge;

public class Rectangle implements Shape{
    private final Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void apply() {
        this.color.colour();
        System.out.println("长方形做门");
    }

}

