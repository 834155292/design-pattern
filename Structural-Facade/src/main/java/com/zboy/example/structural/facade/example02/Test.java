package com.zboy.example.structural.facade.example02;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        /**
         * 一步操作就可以完成所有的准备工作
         */
        facade.open();
    }
}
