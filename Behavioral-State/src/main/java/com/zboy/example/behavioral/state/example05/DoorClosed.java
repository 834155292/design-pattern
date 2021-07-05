package com.zboy.example.behavioral.state.example05;

public class DoorClosed extends DoorState {
    public DoorClosed(Door door) {
        super(door);
    }

    @Override
    public DoorState touch() {
        return door.OPENING;
    }

    @Override
    public String show() {
        return "DoorClosed";
    }

}
