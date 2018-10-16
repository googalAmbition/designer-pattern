package com.ctc.mediator;

public enum Action {

    HUNT("hunted a rabbit", "arrives for dinner"), TALE("tells a tale", "comes to listen"), GOLD(
            "found gold", "takes his share of the gold"),  NONE(
            "", "");

    private String title;
    private String describe;

    Action(String title,String describe) {
        this.title = title;
        this.describe = describe;
    }

    public String getDescribe(){
        return describe;
    }

    @Override
    public String toString() {
        return title;
    }
}
