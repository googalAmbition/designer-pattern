package com.ctc.iterator.bst;

public class TreeNode<T extends Comparable<T>> {
    private T val;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T val) {
        this.val = val;
        this.right = null;
        this.left = null;
    }

    public T getVal() {
        return val;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    private void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    private void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void insert(T valToInsert) {
        TreeNode<T> parent = getParentNodeOfValueToBeInserted(valToInsert);
        parent.insertNewChild(valToInsert);
    }

    private TreeNode<T> getParentNodeOfValueToBeInserted(T valToInsert) {
        TreeNode<T> parent = null;
        TreeNode<T> current = this;
        while (current != null) {
            parent = current;
            current = current.traverseOneLevelDown(valToInsert);
        }
        return parent;
    }

    private TreeNode<T> traverseOneLevelDown(T valToInsert) {
        if (this.isGreaterThan(valToInsert)) {
            return this.left;
        }
        return this.right;
    }

    private boolean isGreaterThan(T val) {
        return this.val.compareTo(val) > 0;
    }

    private void insertNewChild(T valToInsert) {
        if (this.isLessThanOrEqualTo(valToInsert)) {
            this.setRight(new TreeNode<>(valToInsert));
        } else {
            this.setLeft(new TreeNode<>(valToInsert));
        }
    }

    private boolean isLessThanOrEqualTo(T val) {
        return this.val.compareTo(val) < 1;
    }

    @Override
    public String toString() {
        return val.toString();
    }
}

