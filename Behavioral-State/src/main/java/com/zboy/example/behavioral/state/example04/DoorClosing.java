package com.zboy.example.behavioral.state.example04;

public class DoorClosing extends DoorState {
    public DoorClosing(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.OPENING);
    }

    @Override
    public void complete() {
        door.setState(door.CLOSED);
    }

    @Override
    public String show() {
        return "DoorClosing";
    }
}
