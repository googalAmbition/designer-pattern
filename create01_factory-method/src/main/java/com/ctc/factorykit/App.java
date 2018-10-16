package com.ctc.factorykit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
        WeaponFectory fectory = WeaponFectory.fectory((builder) -> {
            builder.add(WeaponType.AXE, Axe::new);
        });

        Weapon axe= fectory.creat(WeaponType.AXE);
        axe.discription();
    }
}

