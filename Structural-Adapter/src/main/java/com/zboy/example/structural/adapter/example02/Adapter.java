package com.zboy.example.structural.adapter.example02;

public class Adapter extends AC220V implements DC5V {
    public Adapter(String name) {
        super(name);
    }

    public int dc5v() {
        int output220v = output220v();
        return (output220v / 44);
    }
}
