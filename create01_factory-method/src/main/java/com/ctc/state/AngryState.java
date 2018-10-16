package com.ctc.state;

import java.text.MessageFormat;

public class AngryState implements State {

    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(MessageFormat.format("{0} gets angry", mammoth));
    }

    @Override
    public void observer() {
        System.out.println(MessageFormat.format("{0} is furious", mammoth));
    }

}

