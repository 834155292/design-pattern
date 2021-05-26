package com.zboy.example.behavioral.visitor.example01;

public class Porcelain implements Treasure {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
