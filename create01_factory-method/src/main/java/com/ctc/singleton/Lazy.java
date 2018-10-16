package com.ctc.singleton;

public class Lazy {

    private static Lazy lazy;

    private Lazy() {
        if (lazy == null) {
            lazy = this;
        } else {
            throw new IllegalStateException("have instance");
        }
    }

    public synchronized Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}

