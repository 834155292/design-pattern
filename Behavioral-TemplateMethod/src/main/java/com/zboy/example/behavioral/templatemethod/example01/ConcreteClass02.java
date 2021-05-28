package com.zboy.example.behavioral.templatemethod.example01;

public class ConcreteClass02 extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("ConcreteClass02抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("ConcreteClass02抽象方法2的实现被调用...");
    }
}
