package com.zboy.example.structural.adapter.example02;

public class AC220V {
    private String name;

    public AC220V(String name) {
        this.name = name;
    }

    /**
     * č·å220Vēµå
     *
     * @return
     */
    public int output220v() {
        int output220v = 220;
        return output220v;
    }
}
