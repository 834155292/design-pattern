package com.zboy.example.behavioral.state.example05;

public class DoorOpen extends DoorState {
    public DoorOpen(Door door) {
        super(door);
    }

    @Override
    public DoorState touch() {
        return door.STAYOPEN;
    }

    @Override
    public String show() {
        return "DoorOpen";
    }
}
