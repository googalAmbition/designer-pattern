package com.ctc.iterator.list;

public class Item {
    private ItemType type;
    private String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public ItemType getType() {
        return type;
    }

    public final void setType(ItemType type) {
        this.type = type;
    }

}

