package com.zboy.example.behavioral.state.example05;

public class Test {
    public static void main(String[] args) {
        Door door = new Door();

        door.touch();
        System.out.println(door.getState());

        door.touch();
        System.out.println(door.getState());

        door.touch();
        System.out.println(door.getState());

        door.touch();
        System.out.println(door.getState());


        door.complete();
        System.out.println(door.getState());
    }
}
