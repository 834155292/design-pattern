package com.zboy.example.behavioral.iterator.example01;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements Collection {
    private List<Object> list = new ArrayList<Object>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
