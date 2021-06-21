package com.zboy.example.creational.singleton.example05;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton instance = Singleton.getInstance();
            System.out.println(instance);
        }
    }
}
