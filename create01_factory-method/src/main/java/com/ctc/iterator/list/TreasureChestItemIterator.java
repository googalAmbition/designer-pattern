package com.ctc.iterator.list;

import com.ctc.iterator.Iterator;

import java.util.List;

public class TreasureChestItemIterator implements Iterator<Item> {

    private TreasureChest chest;
    private int idx;
    private ItemType type;

    public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
        this.chest = chest;
        idx = -1;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx != -1){
            return chest.getItems().get(idx);
        }
        return null;
    }

    private int findNextIdx(){
        List<Item> items = chest.getItems();
        boolean found = false;
        int tempIdx = idx;
        while (!found){
            tempIdx ++;
            if (tempIdx >= items.size()){
                tempIdx = -1;
                break;
            }
            if (type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)){
                break;
            }
        }
        return tempIdx;
    }
}

