package com.zboy.example.behavioral.mediator.example01;

public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
