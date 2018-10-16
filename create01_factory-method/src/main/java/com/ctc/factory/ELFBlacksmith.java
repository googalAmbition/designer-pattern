package com.ctc.factory;

/**
 * @author Administrator
 */
public class ELFBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ELFWeapon(weaponType);
    }
}

