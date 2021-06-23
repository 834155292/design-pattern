package com.zboy.example.structural.adapter.example02;

public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new Adapter("nameA");
        int dc5v = dc5V.dc5v();
        System.out.println(dc5v);
    }
}
