package com.zboy.example.behavioral.visitor.example01;

public class ChineseVisitor implements Visitor {
    @Override
    public void visit(Treasure treasure) {
        System.out.println("接受了中国游客的访问" + treasure);
    }
}
