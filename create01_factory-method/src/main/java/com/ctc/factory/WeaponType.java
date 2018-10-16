package com.ctc.factory;

/**
 * @author Administrator
 */

public enum WeaponType {
    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    private String title;

    WeaponType(String type) {
        this.title = type;
    }

    @Override
    public String toString() {
        return title;
    }
}
