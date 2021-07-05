package com.zboy.example.behavioral.state.example05;

public class DoorStayOpen extends DoorState {
    public DoorStayOpen(Door door) {
        super(door);
    }

    @Override
    public DoorState touch() {
        return door.CLOSING;
    }

    @Override
    public String show() {
        return "DoorStayOpen";
    }
}
