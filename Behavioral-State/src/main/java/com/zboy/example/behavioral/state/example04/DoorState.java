package com.zboy.example.behavioral.state.example04;

public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) {
        this.door = door;
    }

    public abstract void touch();

    public abstract String show();

    public void complete() {

    }

    @Override
    public String toString() {
        return "DoorState{" +
                "door=" + show() +
                '}';
    }
}
