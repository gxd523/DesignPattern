package com.gxd.design.pattern.structural.adapter;

/**
 * 适配器类，实现了「目标接口」，「兼容」了已有类
 * 「适配器」也可以通过「组合」的方式传入「Adaptee对象」
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int getFive() {
        return getTen() - 5;
    }
}