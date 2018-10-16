package com.ctc.observe.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable<S extends Observable<S,O,A>,O extends Observer<S,O,A>,A> {

    protected List<O> observers;

    public Observable(){
        observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer){
        observers.add(observer);
    }

    public void remove(O observer){
        observers.remove(observer);
    }

    public void notifyObserver(A arguments){
        for (O observer : observers){
            observer.update((S) this,arguments);
        }
    }
}

