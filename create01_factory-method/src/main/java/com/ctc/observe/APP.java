package com.ctc.observe;

import org.junit.Test;

public class APP {

    @Test
    public void observeTest(){
        Weather weather = new Weather();
        weather.addObserver(new HobbitObserve());
        weather.addObserver(new OrcsObserve());

        weather.timePassBy();
        weather.timePassBy();
        weather.timePassBy();
        weather.timePassBy();
        weather.timePassBy();
    }
}

