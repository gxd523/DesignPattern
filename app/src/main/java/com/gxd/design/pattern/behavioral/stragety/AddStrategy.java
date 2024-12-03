package com.gxd.design.pattern.behavioral.stragety;

public class AddStrategy implements IStrategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}
