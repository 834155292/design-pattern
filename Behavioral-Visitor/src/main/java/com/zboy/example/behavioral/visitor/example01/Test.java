package com.zboy.example.behavioral.visitor.example01;

public class Test {
    public static void main(String[] args) {
        Treasure bronze = new Bronze();
        Treasure porcelain = new Porcelain();

        Visitor chineseVisitor = new ChineseVisitor();
        Visitor americanVisitor = new AmericanVisitor();

        bronze.accept(chineseVisitor);
        bronze.accept(americanVisitor);
        System.out.println("---------------------");
        porcelain.accept(chineseVisitor);
        porcelain.accept(americanVisitor);

    }
}
