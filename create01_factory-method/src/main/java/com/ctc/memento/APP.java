package com.ctc.memento;

import org.junit.Test;

import java.util.Stack;

public class APP {

    @Test
    public void mementoTest(){
        Stack<StarMemento> states = new Stack<>();

        Star star = new Star(StarType.SUN, 10000000, 500000);
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        while (states.size() > 0) {
            star.setMemento(states.pop());
            System.out.println(star.toString());
        }

    }
}

