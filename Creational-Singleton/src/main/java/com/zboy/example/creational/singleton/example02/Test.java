package com.zboy.example.creational.singleton.example02;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }

    }
}
