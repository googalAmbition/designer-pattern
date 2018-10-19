package com.ctc.visitor;

import org.junit.Test;

public class APP {

    @Test
    public void visitorTest() {
        Commander commander = new Commander(
                new Sergeant(
                        new Soldier(),
                        new Soldier(),
                        new Soldier()),
                new Sergeant(
                        new Soldier(),
                        new Soldier(),
                        new Soldier())
        );
        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}

