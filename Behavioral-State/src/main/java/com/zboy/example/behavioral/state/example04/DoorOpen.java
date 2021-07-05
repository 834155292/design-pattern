package com.zboy.example.behavioral.state.example04;

public class DoorOpen extends DoorState {
    public DoorOpen(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.STAYOPEN);
    }

    @Override
    public String show() {
        return "DoorOpen";
    }
}
