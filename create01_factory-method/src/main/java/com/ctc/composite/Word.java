package com.ctc.composite;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<Letter> letters){
        for (Letter letter : letters){
            this.add(letter);
        }
    }

    @Override
    protected void printThisBrfor() {
        System.out.print(' ');
    }
}

