package com.zboy.example.creational.prototype.example02;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Apple apple = new Apple(12, "red");
        Apple clone = (Apple) apple.clone();
        System.out.println(apple.getColor().equals(clone.getColor()));
        System.out.println(apple.getSize() == clone.getSize());
    }
}
