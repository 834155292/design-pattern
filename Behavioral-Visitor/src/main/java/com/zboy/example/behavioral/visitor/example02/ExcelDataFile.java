package com.zboy.example.behavioral.visitor.example02;

public class ExcelDataFile extends AbstractDataFile {
    public ExcelDataFile(Visitor visitor) {
        super(visitor);
    }


    @Override
    public void action() {
        getVisitor().visit(this);
    }
}
