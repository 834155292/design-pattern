package com.zboy.example.creational.factorymethod.example02;

public class FactoryImpl02 implements Factory {
    public Product createProduct() {
        return new ProductImpl02();
    }
}
