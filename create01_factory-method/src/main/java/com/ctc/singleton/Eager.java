package com.ctc.singleton;

public class Eager {
    private  static final Eager EAGER= new Eager();

    private Eager(){}

    public Eager getInstance(){
        return EAGER;
    }
}

