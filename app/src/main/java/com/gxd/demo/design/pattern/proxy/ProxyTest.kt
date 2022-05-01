package com.gxd.demo.design.pattern.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

fun main() {
    proxyPattern()
    dynamicProxyPattern()
}

/**
 * 代理模式
 */
fun proxyPattern() {
    val subject: Subject = SubjectImpl()
    val subjectProxy: Subject = SubjectProxy(subject)
    subjectProxy.doSomething()
}

/**
 * 动态代理模式
 */
fun dynamicProxyPattern() {
    val subject: Subject = SubjectImpl()
    val invocationHandler = InvocationHandler { proxy, method, args ->
        println("do something before.")
        val result = args?.let { method.invoke(subject, *args) } ?: method.invoke(subject)
        println("do something after.")
        result
    }
    val subjectProxy = Proxy.newProxyInstance(
        Subject::class.java.classLoader,
        arrayOf<Class<*>>(Subject::class.java),// 代理类实现的接口列表
        invocationHandler
    ) as Subject

//        Subject subjectProxy = new $Proxy0(invocationHandler);
    subjectProxy.doSomething()
}