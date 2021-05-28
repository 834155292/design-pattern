package com.zboy.example.behavioral.templatemethod.example02;

public class Test {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}
