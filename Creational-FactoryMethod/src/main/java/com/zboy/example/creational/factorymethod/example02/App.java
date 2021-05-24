package com.zboy.example.creational.factorymethod.example02;

public class App {
    private Factory factory;

    public App(Factory factory) {
        this.factory = factory;
    }

    public void execute() {
        Product product = factory.createProduct();
        processProduct(product);
    }

    private void processProduct(Product product) {
        System.out.println(product.function());
    }
}
