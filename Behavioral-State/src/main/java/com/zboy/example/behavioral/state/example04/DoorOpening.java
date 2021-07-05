package com.zboy.example.behavioral.state.example04;

public class DoorOpening extends DoorState {
    public DoorOpening(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.CLOSING);
    }

    @Override
    public void complete() {
        door.setState(door.OPEN);
    }

    @Override
    public String show() {
        return "DoorOpening";
    }
}
