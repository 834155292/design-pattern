package com.zboy.example.structural.composite.example02;

public class Test {
    public static void main(String[] args) {
        Component component = getComposite();
        int number = component.getNumber();
        System.out.println(number);
    }

    private static Component getComposite() {
        Composite composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Leaf());

        Composite com = new Composite();
        com.add(composite);
        com.add(new Leaf());
        return com;

    }
}
