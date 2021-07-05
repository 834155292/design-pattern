package com.zboy.example.behavioral.state.example05;

public class DoorClosing extends DoorState {
    public DoorClosing(Door door) {
        super(door);
    }

    @Override
    public DoorState touch() {
        return door.OPENING;
    }

    @Override
    public DoorState complete() {
        return door.CLOSED;
    }

    @Override
    public String show() {
        return "DoorClosing";
    }
}
