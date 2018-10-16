package com.ctc.factorykit;

public class Axe implements Weapon{
    @Override
    public void discription() {
        App.LOGGER.info("i'am AXE.");
    }
}

