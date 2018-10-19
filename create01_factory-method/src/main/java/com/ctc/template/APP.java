package com.ctc.template;

import org.junit.Test;

public class APP {

    @Test
    public void templateTest(){
        Game footballGame = new FootballGame();
        footballGame.play();

        Game basketballGame = new BasketballGame();
        basketballGame.play();
    }

    @Test
    public void test(){
        Platform platform = new Platform(new BasketballGame());
        platform.excute();
    }
}

