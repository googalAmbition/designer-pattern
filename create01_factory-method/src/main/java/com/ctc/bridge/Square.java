package com.ctc.bridge;

public class Square implements Shape{

    private final Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void apply() {
        color.colour();
        System.out.println("正方形做桌子");
    }

}

