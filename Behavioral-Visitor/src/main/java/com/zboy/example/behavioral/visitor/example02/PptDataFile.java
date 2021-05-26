package com.zboy.example.behavioral.visitor.example02;

public class PptDataFile extends AbstractDataFile {
    public PptDataFile(Visitor visitor) {
        super(visitor);
    }


    @Override
    public void action() {
        getVisitor().visit(this);
    }
}
