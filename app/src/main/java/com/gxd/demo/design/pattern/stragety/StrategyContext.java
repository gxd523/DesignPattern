package com.gxd.demo.design.pattern.stragety;

public class StrategyContext {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int useStrategy(int num1, int num2) {
        if (strategy == null) {
            return -1;
        }
        return strategy.operation(num1, num2);
    }
}
