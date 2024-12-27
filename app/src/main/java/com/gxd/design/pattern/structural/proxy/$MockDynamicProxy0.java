package com.gxd.design.pattern.structural.proxy;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * 「JVM」会在虚拟机中动态生成「$Proxy0」类，然后通过反射创建实例
 */
public final class $MockDynamicProxy0 extends Proxy implements Subject {
    private static Method doSomethingMethod;

    public $MockDynamicProxy0(InvocationHandler h) {
        super(h);
    }

    @Override
    public void doSomething(@NotNull String param) {
        try {
            // Method.invoke的调用会转发到 InvocationHandler 的 invoke 方法
            super.h.invoke(this, doSomethingMethod, new Object[]{param});
        } catch (Throwable t) {
            throw new UndeclaredThrowableException(t);
        }
    }
}
