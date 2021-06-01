package com.zboy.example.structural.bridge.example03;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void show() {
        getColor().showColor();
        System.out.println("circle...");
    }
}
