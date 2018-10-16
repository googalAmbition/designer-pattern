package com.ctc.state;

import org.junit.Test;

public class APP {

    @Test
    public void stateTest(){
        Mammoth mammoth = new Mammoth();

        mammoth.observe();
        mammoth.timePassBy();
        mammoth.observe();
        mammoth.timePassBy();
        mammoth.observe();

    }
}

