package com.ctc.visitor;

import java.text.MessageFormat;

public class CommanderVisitor implements UnitVisitor {
    @Override
    public void visitSolder(Soldier soldier) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println(MessageFormat.format("Greeting {0}", commander));
    }
}

