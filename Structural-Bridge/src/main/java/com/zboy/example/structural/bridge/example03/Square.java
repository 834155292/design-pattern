package com.zboy.example.structural.bridge.example03;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void show() {
        getColor().showColor();
        System.out.println("square...");
    }
}
