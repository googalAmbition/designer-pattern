package com.ctc.decorator;

public class IronMan implements Man {

    private Man normalMan;

    public IronMan(Man normalMan) {
        this.normalMan = normalMan;
    }

    @Override
    public void run() {
        normalMan.run();
        System.out.println("upgrade iron man speed 1000m/s");
    }

    @Override
    public int highJump() {
        System.out.println("upgrade iron man highJump "+normalMan.highJump()*100+"m.");
        return normalMan.highJump()*100;
    }

    @Override
    public int weightlifting() {
        System.out.println("upgrade iron man weightlifting "+normalMan.weightlifting()*100+" KG");
        return normalMan.weightlifting()*100;
    }
}

