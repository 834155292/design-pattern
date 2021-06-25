package com.zboy.example.behavioral.observer.example03;

import java.util.Observable;

public class Subject extends Observable {

    public void change(String value) {
        super.setChanged();
        notifyObservers(value);
    }
}
