package com.ctc.factory;

public class ELFWeapon implements Weapon {
    private WeaponType weaponType;

    public ELFWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    @Override
    public String toString() {
        return "ELFWeapon " + weaponType;
    }
}

