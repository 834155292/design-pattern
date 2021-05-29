package com.zboy.example.creational.builder.example02;

public interface Builder {
    void build_CPU();

    void build_mainboard();

    void build_memory();

    void build_DISK();

    void build_power();

    Computer getComputer();
}
