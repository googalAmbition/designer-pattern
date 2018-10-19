package com.ctc.visitor;

import java.text.MessageFormat;

public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visitSolder(Soldier soldier) {
        System.out.println(MessageFormat.format("Greeting {0}", soldier));
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }
}

