package com.zboy.example.behavioral.state.example04;

public class DoorClosed extends DoorState {
    public DoorClosed(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.OPENING);
    }

    @Override
    public String show() {
        return "DoorClosed";
    }

}
