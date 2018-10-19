package com.ctc.template;

public class Platform {

    private Game game;

    public Platform(Game game) {
        this.game = game;
    }

    public void excute(){
        game.play();
    }
}

