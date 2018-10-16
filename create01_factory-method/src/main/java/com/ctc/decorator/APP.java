package com.ctc.decorator;

import org.junit.Test;

public class APP {
    @Test
    public void decorator(){
        Man normalMan = new NormalMan();
        normalMan.run();
        normalMan.highJump();
        normalMan.weightlifting();

        System.out.println("==============");
        Man ironMan = new IronMan(normalMan);
        ironMan.run();
        ironMan.highJump();
        ironMan.weightlifting();
    }
}

