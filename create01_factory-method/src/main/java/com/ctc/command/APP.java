package com.ctc.command;

import org.junit.Test;

import java.text.MessageFormat;

public class APP {

    @Test
    public void commandTest(){
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        goblin.printStatus();

        wizard.castSpell(new ShrinkSpell(), goblin);
        goblin.printStatus();

        wizard.castSpell(new InvisibilitySpell(), goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();
    }

    @Test
    public void msg(){
        System.out.println(MessageFormat.format("{0}--{1},{2}",1,2,3));
    }
}

