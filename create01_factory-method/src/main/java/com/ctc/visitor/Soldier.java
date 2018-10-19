package com.ctc.visitor;

public class Soldier extends Unit {
    public Soldier(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSolder(this);
        super.accept(visitor);
    }

    @Override
    public String toString(){
        return "soldier";
    }
}

