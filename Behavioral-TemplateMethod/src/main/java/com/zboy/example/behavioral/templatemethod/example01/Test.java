package com.zboy.example.behavioral.templatemethod.example01;

public class Test {
    public static void main(String[] args) {
        AbstractClass tm1 = new ConcreteClass01();
        tm1.TemplateMethod();

        AbstractClass tm2 = new ConcreteClass01();
        tm2.TemplateMethod();


    }
}
