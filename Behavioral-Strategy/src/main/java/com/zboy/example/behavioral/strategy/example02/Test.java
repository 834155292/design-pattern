package com.zboy.example.behavioral.strategy.example02;

public class Test {
    public static void main(String[] args) {
        Context c = new Context();
        c.setStrategy(StrategyProvider.chooseStrategy("A"));
        c.strategyMethod();
        System.out.println();
        c.setStrategy(StrategyProvider.chooseStrategy("B"));
        c.strategyMethod();
    }
}
