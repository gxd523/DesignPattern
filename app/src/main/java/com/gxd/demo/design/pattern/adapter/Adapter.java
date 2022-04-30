package com.gxd.demo.design.pattern.adapter;

/**
 * 实现适配的类
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int getFive() {
        return getTen() - 5;
    }
}