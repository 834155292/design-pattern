package com.zboy.example.structural.adapter.example02;

public class AC220V {
    private String name;

    public AC220V(String name) {
        this.name = name;
    }

    /**
     * 获取220V电压
     *
     * @return
     */
    public int output220v() {
        int output220v = 220;
        return output220v;
    }
}
