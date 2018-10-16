package com.ctc.composite;

public class Letter extends LetterComposite{

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBrfor() {
        System.out.print(c);
    }
}

