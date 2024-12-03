package com.gxd.design.pattern.creational.singleton

/**
 * 单例模式
 */
fun main() {
    // 饿汉式单例
    val hungrySingleton = HungrySingleton.getInstance()
    // 懒汉式单例
    val lazySingleton = LazySingleton.getInstance()
    // 静态单例
    val staticSingleton = StaticSingleton.getInstance()
    // 枚举单例
    val enumSingleton = EnumSingleton.INSTANCE
}