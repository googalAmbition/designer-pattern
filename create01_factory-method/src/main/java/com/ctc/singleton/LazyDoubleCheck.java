package com.ctc.singleton;

public class LazyDoubleCheck {

    private volatile LazyDoubleCheck instance;

    private  LazyDoubleCheck(){}

    public LazyDoubleCheck getInstance(){
        LazyDoubleCheck result = instance;
        if (result ==null){
            synchronized (LazyDoubleCheck.this){
                if (result == null){
                    result = new LazyDoubleCheck();
                }
            }
        }
        return result;
    }

}

