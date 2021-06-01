package com.zboy.example.structural.bridge.example03;

public class Test {
    public static void main(String[] args) {
        Color color = new RedColor();
        Shape shape = new Circle(color);
        shape.show();
        System.out.println();

        color = new BlueColor();
        shape = new Circle(color);
        shape.show();
        System.out.println();

        color = new BlueColor();
        shape = new Square(color);
        shape.show();
        System.out.println();
    }
}
