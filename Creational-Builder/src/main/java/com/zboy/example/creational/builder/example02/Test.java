package com.zboy.example.creational.builder.example02;

public class Test {
    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        Director director = new Director();
        director.construct(builder);
        builder.getComputer().show();
    }
}
