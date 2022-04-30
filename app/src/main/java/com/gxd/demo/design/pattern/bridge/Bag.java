package com.gxd.demo.design.pattern.bridge;

public class Bag {
    private final IColor color;
    private final IBag bag;

    public Bag(IColor color, IBag bag) {
        this.color = color;
        this.bag = bag;
    }

    public String getName() {
        return String.format("%s %s", color.getColor(), bag.getStyle());
    }
}
