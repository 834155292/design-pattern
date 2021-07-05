package com.zboy.example.behavioral.state.example05;

public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) {
        this.door = door;
    }

    public abstract DoorState touch();

    public abstract String show();

    public DoorState complete() {
        return this;
    }

    @Override
    public String toString() {
        return "DoorState{" +
                "door=" + show() +
                '}';
    }
}
