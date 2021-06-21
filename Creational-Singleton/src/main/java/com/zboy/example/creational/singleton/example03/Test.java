package com.zboy.example.creational.singleton.example03;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(instance);
        }
    }
}
