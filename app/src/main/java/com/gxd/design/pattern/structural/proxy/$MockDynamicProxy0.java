package com.gxd.design.pattern.structural.proxy;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class $MockDynamicProxy0 extends Proxy implements Subject {
    private static Method m0;
    private static Method m1;
    private static Method m2;
    /**
     * Subject.doSomething()
     */
    private static Method m3;

    public $MockDynamicProxy0(InvocationHandler arg0) {
        super(arg0);
    }

    @Override
    public void doSomething(@NotNull String param) {
        try {
            m3 = Subject.class.getMethod("doSomething");
            h.invoke(this, m3, new Object[]{param});
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
