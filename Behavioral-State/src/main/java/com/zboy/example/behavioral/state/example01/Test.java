package com.zboy.example.behavioral.state.example01;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
