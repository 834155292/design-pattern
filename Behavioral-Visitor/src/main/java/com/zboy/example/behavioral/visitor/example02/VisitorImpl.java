package com.zboy.example.behavioral.visitor.example02;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(WordDataFile file) {
        System.out.println("this is WordDataFile");
    }

    @Override
    public void visit(ExcelDataFile file) {
        System.out.println("this is ExcelDataFile");

    }

    @Override
    public void visit(PptDataFile file) {
        System.out.println("this is PptDataFile");

    }
}
