package com.zboy.example.behavioral.strategy.example02;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装策略的选择
 */
public class StrategyProvider {

    private static final Map<String, Strategy> STRATEGY_HOLDER = new HashMap() {{
        put("A", new ConcreteStrategyA());
        put("B", new ConcreteStrategyB());
    }};


    public static Strategy chooseStrategy(String key) {


        return STRATEGY_HOLDER.get(key);

    }
}
