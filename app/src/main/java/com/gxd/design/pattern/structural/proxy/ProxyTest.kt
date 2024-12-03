package com.gxd.design.pattern.structural.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

fun main() {
    val param = "machine"
    proxyPattern(param)
    dynamicProxyPattern(param)
}

/**
 * 代理模式
 */
fun proxyPattern(param: String) {
    val subject = RealSubject()
    val proxy = Proxy(subject)
    proxy.doSomething(param)
}

/**
 * 动态代理模式
 */
fun dynamicProxyPattern(param: String) {
    val realSubject = RealSubject()
    val invocationHandler = InvocationHandler { proxy, method, args ->
        println("DynamicProxy: do something before.")
        val result = method.invoke(realSubject, *(args ?: emptyArray<Any?>()))
        println("DynamicProxy: do something after.")
        result
    }
    val dynamicProxy = Proxy.newProxyInstance(
        Subject::class.java.classLoader,
        arrayOf<Class<*>>(Subject::class.java),// 代理类实现的接口列表
        invocationHandler
    ) as Subject

//        Subject subjectProxy = new $Proxy0(invocationHandler);
    dynamicProxy.doSomething(param)
}