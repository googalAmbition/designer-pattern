package com.ctc.command;

public abstract class Command {

    public abstract void excute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}

