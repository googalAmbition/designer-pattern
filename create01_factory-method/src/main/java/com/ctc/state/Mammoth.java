package com.ctc.state;

public class Mammoth {

    private State state;

    public Mammoth(){
        state = new PeacefulState(this);
    }

    public void timePassBy(){
        if (state.getClass().equals(PeacefulState.class)){
            changeStateTo(new AngryState(this));
        }else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState){
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "The Mammoth";
    }

    public void observe(){
        this.state.observer();
    }
}

