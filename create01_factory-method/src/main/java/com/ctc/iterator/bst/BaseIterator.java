package com.ctc.iterator.bst;

import com.ctc.iterator.Iterator;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class BaseIterator<T extends Comparable<T>> implements Iterator<TreeNode<T>> {

    private ArrayDeque<TreeNode<T>> pathStack;

    public BaseIterator(TreeNode<T> root) {
        this.pathStack = new ArrayDeque<>();
        pushPathToNextSmallest(root);
    }

    private void pushPathToNextSmallest(TreeNode node){
        while (node != null){
            pathStack.push(node);
            node = node.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !pathStack.isEmpty();
    }

    @Override
    public TreeNode<T> next() {
        if (pathStack.isEmpty()){
            throw new NoSuchElementException();
        }
        TreeNode<T> next = pathStack.pop();
        pushPathToNextSmallest(next.getRight());
        return next;
    }
}

