package com.ctc.iterator;

import com.ctc.iterator.bst.BaseIterator;
import com.ctc.iterator.bst.TreeNode;
import com.ctc.iterator.list.Item;
import com.ctc.iterator.list.ItemType;
import com.ctc.iterator.list.TreasureChest;
import org.junit.Test;

import java.text.MessageFormat;

public class APP {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    @Test
    public void iteratorTest(){
        Iterator<Item> itemIterator = TREASURE_CHEST.iterator(ItemType.RING);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().toString());
        }
    }

    @Test
    public void treeIteratorTest(){
        TreeNode<Integer> root = buildIntegerBst();
        BaseIterator baseIterator = new BaseIterator(root);
        while (baseIterator.hasNext()){
            System.out.println(MessageFormat.format("Next node:{0}",baseIterator.next().getVal()));
        }

    }

    private TreeNode<Integer> buildIntegerBst(){
        TreeNode<Integer> root = new TreeNode<>(0);
        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);
        return root;
    }
}

