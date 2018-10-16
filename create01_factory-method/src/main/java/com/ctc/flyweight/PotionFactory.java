package com.ctc.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class PotionFactory {


    enum PotionType {
        POISON, HEAL, HOLY_WATER;
    }

    public PotionFactory() {
        this.potions = new EnumMap<>(PotionType.class);
    }

    private final Map<PotionType, Potion> potions;

    public Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEAL:
                    potion = new HealPotion();
                    potions.put(type,potion);
                    break;
                case POISON:
                    potion = new PoisonPotion();
                    potions.put(type,potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(type,potion);
                    break;
                default:
                    break;
            }
        }
        return potion;

    }


}

