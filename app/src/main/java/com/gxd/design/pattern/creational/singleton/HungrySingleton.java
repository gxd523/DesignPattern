package com.gxd.design.pattern.creational.singleton;

/**
 * 饿汉单例
 */
public class HungrySingleton {
    /**
     * JVM保证线程安全
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("初始化");
    }

    /**
     * 当调用静态方法时,会初始化静态成员变量
     * HungrySingleton.class并不会触发静态成员的初始化
     * 如果单例只有一个静态方法getInstance(),则不存在提前初始化问题
     */
    public static void otherStaticMethod() {
        System.out.println("hahaha");
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
