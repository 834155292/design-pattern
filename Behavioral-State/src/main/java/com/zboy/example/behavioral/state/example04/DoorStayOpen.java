package com.zboy.example.behavioral.state.example04;

public class DoorStayOpen extends DoorState {
    public DoorStayOpen(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.CLOSING);
    }

    @Override
    public String show() {
        return "DoorStayOpen";
    }
}
