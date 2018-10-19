package com.ctc.template;

public class FootballGame extends Game {
    @Override
    public void initGame() {
        System.out.println("init football game");
    }

    @Override
    public void startGame() {
        System.out.println("start football game");
    }

    @Override
    public void endGame() {
        System.out.println("end football game");
    }
}

