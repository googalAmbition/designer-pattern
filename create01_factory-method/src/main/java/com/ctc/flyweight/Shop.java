package com.ctc.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Potion> topShelf;
    private List<Potion> bottomShelf;

    public Shop() {
        topShelf = new ArrayList<>();
        bottomShelf = new ArrayList<>();
        fillShelf();
    }

    private void fillShelf() {
        PotionFactory factory = new PotionFactory();

        topShelf.add(factory.createPotion(PotionFactory.PotionType.HEAL));
        topShelf.add(factory.createPotion(PotionFactory.PotionType.HEAL));
        topShelf.add(factory.createPotion(PotionFactory.PotionType.POISON));
        topShelf.add(factory.createPotion(PotionFactory.PotionType.POISON));
        topShelf.add(factory.createPotion(PotionFactory.PotionType.HOLY_WATER));
        topShelf.add(factory.createPotion(PotionFactory.PotionType.HOLY_WATER));

        bottomShelf.add(factory.createPotion(PotionFactory.PotionType.HEAL));
        bottomShelf.add(factory.createPotion(PotionFactory.PotionType.HEAL));
        bottomShelf.add(factory.createPotion(PotionFactory.PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionFactory.PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionFactory.PotionType.HOLY_WATER));
        bottomShelf.add(factory.createPotion(PotionFactory.PotionType.HOLY_WATER));
    }

    public void enumerate() {
        System.out.println("===top===");
        for (Potion potion : topShelf) {
            potion.drink();
        }

        System.out.println("===bottom===");
        for (Potion potion : bottomShelf) {
            potion.drink();
        }
    }

}

