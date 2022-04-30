package com.gxd.demo.design.pattern.bridge;

public class Wallet implements IBag {
    @Override
    public String getStyle() {
        return "wallet";
    }
}
