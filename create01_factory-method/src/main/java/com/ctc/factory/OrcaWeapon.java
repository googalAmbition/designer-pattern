package com.ctc.factory;

//魔兽武器
public class OrcaWeapon implements Weapon {

    private WeaponType weaponType;

    public OrcaWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    @Override
    public String toString() {
        return "Orca " + weaponType;
    }
}

