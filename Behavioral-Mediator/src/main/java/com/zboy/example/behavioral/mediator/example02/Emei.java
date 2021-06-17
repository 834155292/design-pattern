package com.zboy.example.behavioral.mediator.example02;

public class Emei extends United {
    public Emei(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }

    public void sendAlliance(String message) {
        wulinAlliance.notice(message, Emei.this);
    }

    public void getNotice(String message) {
        System.out.println("峨眉收到消息：" + message);
    }
}
