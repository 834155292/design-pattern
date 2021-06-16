package com.zboy.example.structural.proxy.example01;

public class RealSubject implements Subject {
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
