package com.zboy.example.behavioral.visitor.example02;

public class WordDataFile extends AbstractDataFile {
    public WordDataFile(Visitor visitor) {
        super(visitor);
    }

    @Override
    public void action() {
        getVisitor().visit(this);
    }
}
