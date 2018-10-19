package com.ctc.visitor;

import java.text.MessageFormat;

public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visitSolder(Soldier soldier) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.println(MessageFormat.format("Greeting {0}", sergeant));
    }

    @Override
    public void visitCommander(Commander commander) {

    }
}

