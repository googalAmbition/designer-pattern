package com.ctc.composite;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for (Word word : words) {
            this.add(word);
        }
    }


    @Override
    protected void printThisAfter() {
        System.out.print('.');
    }
}

