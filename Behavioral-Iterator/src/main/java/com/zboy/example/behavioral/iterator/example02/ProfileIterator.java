package com.zboy.example.behavioral.iterator.example02;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
