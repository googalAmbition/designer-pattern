package com.ctc.interpreter;

public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}

