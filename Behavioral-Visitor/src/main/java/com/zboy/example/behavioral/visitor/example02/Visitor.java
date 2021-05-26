package com.zboy.example.behavioral.visitor.example02;

public interface Visitor {
    void visit(WordDataFile file);

    void visit(ExcelDataFile file);

    void visit(PptDataFile file);


}
