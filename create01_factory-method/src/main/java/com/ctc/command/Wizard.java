package com.ctc.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Administrator
 */
public class Wizard {

    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {
    }

    public void castSpell(Command command, Target target) {
        System.out.println(String.format("%s casts %s at %s", this, command, target));
        command.excute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            System.out.println(String.format("%s undo %s", this, previousSpell));
            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command prevoiuSpell = redoStack.pollLast();
            System.out.printf("%s redoes %s %n",this,prevoiuSpell);
            prevoiuSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}

