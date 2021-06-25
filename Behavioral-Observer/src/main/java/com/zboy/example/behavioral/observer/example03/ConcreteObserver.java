package com.zboy.example.behavioral.observer.example03;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observable is " + o + ";got it->" + arg);
    }
}
