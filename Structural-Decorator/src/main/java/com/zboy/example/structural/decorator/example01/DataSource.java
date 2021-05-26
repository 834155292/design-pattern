package com.zboy.example.structural.decorator.example01;

public interface DataSource {
    void writeData(String data);

    String readData();
}
