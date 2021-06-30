package com.zboy.example.structural.flyweight.example01;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

    //转换成静态内部类可以防止被其他客户端实例化。客户对象永远不会引用该内部类。享元应该由享元工厂创建。
    private static class ConcreteFlyweight implements Flyweight {
        private String key;

        ConcreteFlyweight(String key) {
            this.key = key;
            System.out.println("具体享元" + key + "被创建！");
        }

        public void operation(UnsharedConcreteFlyweight outState) {
            System.out.print("具体享元" + key + "被调用，");
            System.out.println("非享元信息是:" + outState.getInfo());
        }
    }
}
