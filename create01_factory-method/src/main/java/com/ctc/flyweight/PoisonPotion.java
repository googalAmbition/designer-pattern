package com.ctc.flyweight;

public class PoisonPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("drink poison potion. @" + System.identityHashCode(this));
    }
}

