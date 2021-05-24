package com.zboy.example.creational.factorymethod.example02;

public class Test {
    public static void main(String[] args) {
        App app = new App(new FactoryImpl01());
        app.execute();

        app = new App(new FactoryImpl02());
        app.execute();
    }
}
