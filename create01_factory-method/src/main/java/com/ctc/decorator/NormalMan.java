package com.ctc.decorator;

public class NormalMan implements Man {
    @Override
    public void run() {
        System.out.println("Normal man run.");
    }

    @Override
    public int highJump() {
        System.out.println("Normal man heigh jump 1m.");
        return 1;
    }

    @Override
    public int weightlifting() {
        System.out.println("Normal man weightlifting 30KG.");
        return 30;
    }
}

