package com.gxd.design.pattern.structural.bridge;

public class Wallet implements IBag {
    @Override
    public String getStyle() {
        return "wallet";
    }
}
