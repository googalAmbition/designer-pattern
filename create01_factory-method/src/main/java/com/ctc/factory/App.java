package com.ctc.factory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        Blacksmith elf = new ELFBlacksmith();
        Weapon sword = elf.manufactureWeapon(WeaponType.SHORT_SWORD);
        LOGGER.info(sword.toString());
    }
}

