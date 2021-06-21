package com.zboy.example.creational.singleton.example04;


public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton instance = Singleton.getSingleton();
            System.out.println(instance);
        }
    }
}
