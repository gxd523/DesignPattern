package com.gxd.design.pattern.structural.decorator;

/**
 * 具体的组件
 */
public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("do something.");
    }
}
