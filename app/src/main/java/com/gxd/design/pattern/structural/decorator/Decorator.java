package com.gxd.design.pattern.structural.decorator;

/**
 * Created by guoxiaodong on 2019/4/7 16:02
 */
public abstract class Decorator implements Component {
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
