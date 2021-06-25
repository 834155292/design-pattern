package com.zboy.example.behavioral.observer.example03;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ConcreteObserver concreteObserver = new ConcreteObserver();

        subject.addObserver(concreteObserver);

        subject.change("1101");
    }
}
