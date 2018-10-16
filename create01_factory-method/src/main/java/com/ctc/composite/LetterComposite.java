package com.ctc.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {
    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letterComposite){
        children.add(letterComposite);
    }

    public int count(){
        return children.size();
    }

    protected void printThisBrfor(){}

    protected void printThisAfter(){}

    public void print(){
        printThisBrfor();
        for (LetterComposite l:children ) {
            l.print();
        }
        printThisAfter();
    }

}

