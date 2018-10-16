package com.ctc.factorykit;

import java.util.function.Supplier;

@FunctionalInterface
public interface Builder {
    void add(WeaponType type,Supplier<Weapon> weapon);
}

