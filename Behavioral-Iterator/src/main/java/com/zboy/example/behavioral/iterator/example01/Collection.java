package com.zboy.example.behavioral.iterator.example01;

public interface Collection {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
