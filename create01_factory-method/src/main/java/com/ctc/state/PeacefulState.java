package com.ctc.state;

import java.text.MessageFormat;

public class PeacefulState implements State {

    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(MessageFormat.format("{0} is calm peaceful", mammoth));
    }

    @Override
    public void observer() {
        System.out.println(MessageFormat.format("{0} calm down", mammoth));
    }
}

