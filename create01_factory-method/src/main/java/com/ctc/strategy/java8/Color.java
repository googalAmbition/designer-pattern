package com.ctc.strategy.java8;

public enum Color {
    RED("red"), GREEN("green"), BROWN("brown"),BLUE("blue");
    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }

}

