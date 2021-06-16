package com.zboy.example.behavioral.observer.example02;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
