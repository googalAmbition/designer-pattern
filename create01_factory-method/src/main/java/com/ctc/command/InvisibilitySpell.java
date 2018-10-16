package com.ctc.command;

public class InvisibilitySpell extends Command {

    private Target target;

    @Override
    public void excute(Target target) {
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if (target != null){
            target.setVisibility(Visibility.VISIBLE);
        }
    }

    @Override
    public void redo() {
        if (target != null){
            target.setVisibility(Visibility.INVISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Invisibility spell";
    }
}

