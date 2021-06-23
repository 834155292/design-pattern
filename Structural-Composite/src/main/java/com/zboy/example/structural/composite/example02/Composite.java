package com.zboy.example.structural.composite.example02;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list = new ArrayList<>();

    @Override
    public int getNumber() {
        int i = 0;
        for (Component component : list) {
            i = i + component.getNumber();
        }
        return i;
    }

    void add(Component component) {
        list.add(component);
    }

    void remove(Component component) {
        list.remove(component);
    }

    List<Component> getChildren() {
        return list;
    }
}
