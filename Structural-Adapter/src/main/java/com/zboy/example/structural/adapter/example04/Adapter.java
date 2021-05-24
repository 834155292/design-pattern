package com.zboy.example.structural.adapter.example04;

public class Adapter implements DC5V {
    private ACV acv;

    public Adapter(AC220V ac220V) {
        this.acv = ac220V;
    }

    public Adapter(AC110V ac110V) {
        this.acv = ac110V;
    }

    public int dc5v() {
        int ac = 0;
        if (acv != null) {
            ac = acv.output();
        }
        int sta = ac / 5;
        return (ac / sta);
    }
}
