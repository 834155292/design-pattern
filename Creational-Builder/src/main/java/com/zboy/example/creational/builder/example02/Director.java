package com.zboy.example.creational.builder.example02;

public class Director {
    public void construct(Builder builder) {
        builder.build_CPU();
        builder.build_mainboard();
        builder.build_memory();
        builder.build_DISK();
        builder.build_power();
    }
}
