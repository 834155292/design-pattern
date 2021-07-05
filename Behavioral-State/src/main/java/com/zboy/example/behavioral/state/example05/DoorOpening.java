package com.zboy.example.behavioral.state.example05;

public class DoorOpening extends DoorState {
    public DoorOpening(Door door) {
        super(door);
    }

    @Override
    public DoorState touch() {
        return door.CLOSING;
    }

    @Override
    public DoorState complete() {
        return door.OPEN;
    }

    @Override
    public String show() {
        return "DoorOpening";
    }
}
