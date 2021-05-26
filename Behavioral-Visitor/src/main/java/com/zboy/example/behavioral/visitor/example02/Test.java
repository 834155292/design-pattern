package com.zboy.example.behavioral.visitor.example02;

public class Test {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        DataFile file = new WordDataFile(visitor);
        file.action();

        file = new PptDataFile(visitor);
        file.action();


        file = new ExcelDataFile(visitor);
        file.action();
    }
}
