package com.ctc.singleton;

public class LazyInnerClazz {

    private LazyInnerClazz(){}

    public LazyInnerClazz getInstance(){
        return Helper.Instance;
    }

    private static class Helper{
        private static final LazyInnerClazz Instance= new LazyInnerClazz();
    }
}

