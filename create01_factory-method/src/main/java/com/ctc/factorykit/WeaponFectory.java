package com.ctc.factorykit;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
public interface WeaponFectory {

    Weapon creat(WeaponType type);

    static WeaponFectory fectory(Consumer<Builder> consumer){
        Map<WeaponType,Supplier<Weapon>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }
}

