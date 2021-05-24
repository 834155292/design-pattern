package com.zboy.example.structural.adapter.example03;

public class Adapter implements DC5V {
    AC220V ac220V;

    public Adapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    public int dc5v() {
        int output220v = ac220V.output220v();
        return (output220v / 44);
    }
}
