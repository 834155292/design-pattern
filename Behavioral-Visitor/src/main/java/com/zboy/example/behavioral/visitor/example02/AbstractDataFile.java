package com.zboy.example.behavioral.visitor.example02;

public abstract class AbstractDataFile implements DataFile {
    private Visitor visitor;

    public AbstractDataFile(Visitor visitor) {
        this.visitor = visitor;
    }

//    @Override
//    public void accept() {
//        visitor.visit(this);
//    }

    public Visitor getVisitor() {
        return visitor;
    }
}
