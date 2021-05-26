package com.zboy.example.behavioral.visitor.example01;

public class AmericanVisitor implements Visitor {
    @Override
    public void visit(Treasure treasure) {
        System.out.println("accept an American visit" + treasure);
    }
}
