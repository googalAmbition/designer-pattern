package com.ctc.flyweight;

public class HealPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("drink heal potion. @" + System.identityHashCode(this));
    }
}

