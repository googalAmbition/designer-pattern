package com.ctc.template;

public abstract class Game {

    public abstract void initGame();
    public abstract void startGame();
    public abstract void endGame();

    public final void play(){
        initGame();
        startGame();
        endGame();
    }

}

