package com.zboy.example.creational.singleton.example06;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton instance = Singleton.INSTANCE;
            System.out.println(instance);
        }
    }
}
