package com.ctc.facade;

import org.junit.Test;

public class APP {
    @Test
    public void facadeTest(){
        Facade facade = new Facade();

        facade.ent();

        System.out.println("===========");
        facade.dermatology();
    }

}

