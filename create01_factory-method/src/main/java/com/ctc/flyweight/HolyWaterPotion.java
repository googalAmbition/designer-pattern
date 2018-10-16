package com.ctc.flyweight;

public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("drink holy water potion. @" + System.identityHashCode(this));
    }
}

