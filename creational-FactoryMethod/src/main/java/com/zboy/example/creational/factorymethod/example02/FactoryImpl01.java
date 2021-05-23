package com.zboy.example.creational.factorymethod.example02;

public class FactoryImpl01 implements Factory {
    public Product createProduct() {
        return new ProductImpl01();
    }
}
