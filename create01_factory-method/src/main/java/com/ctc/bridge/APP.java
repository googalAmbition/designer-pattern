package com.ctc.bridge;

import org.junit.Test;

public class APP {

    @Test
    public void circle(){
        Color red = new Red();
        Shape circle = new Circle(red);
        circle.apply();

        new Rectangle(new Yellow()).apply();
    }
}

