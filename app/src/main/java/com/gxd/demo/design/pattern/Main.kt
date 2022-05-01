package com.gxd.demo.design.pattern

import com.gxd.demo.design.pattern.adapter.Adapter
import com.gxd.demo.design.pattern.adapter.Target
import com.gxd.demo.design.pattern.chain.event.Event
import com.gxd.demo.design.pattern.chain.event.impl.Activity
import com.gxd.demo.design.pattern.chain.event.impl.View
import com.gxd.demo.design.pattern.chain.event.impl.ViewGroup
import com.gxd.demo.design.pattern.chain.interceptor.Interceptor
import com.gxd.demo.design.pattern.chain.interceptor.Request
import com.gxd.demo.design.pattern.chain.interceptor.impl.CallServerInterceptor
import com.gxd.demo.design.pattern.chain.interceptor.impl.ChainImpl
import com.gxd.demo.design.pattern.chain.interceptor.impl.RetryAndFollowUpInterceptor
import com.gxd.demo.design.pattern.decorator.ConcreteComponent
import com.gxd.demo.design.pattern.decorator.ConcreteDecorator1
import com.gxd.demo.design.pattern.decorator.ConcreteDecorator2
import com.gxd.demo.design.pattern.observer.Observable
import com.gxd.demo.design.pattern.observer.Observer
import com.gxd.demo.design.pattern.observer.callback.Button
import com.gxd.demo.design.pattern.proxy.Subject
import com.gxd.demo.design.pattern.proxy.SubjectImpl
import com.gxd.demo.design.pattern.proxy.SubjectProxy
import com.gxd.demo.design.pattern.state.CloseState
import com.gxd.demo.design.pattern.state.Context
import com.gxd.demo.design.pattern.template.AbstractTemplate
import com.gxd.demo.design.pattern.template.ElephantTemplate
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

fun main() {
    callback()
    observerPattern()
    decoratorPattern()
    proxyPattern()
    dynamicProxyPattern()
    templatePattern()
    responsibilityChainPattern()
    okHttpInterceptor()
    adapterPattern()
    statePattern()
}

fun statePattern() {
    val context = Context()
    context.setCurrentState(CloseState())
    context.open()
    context.run()
    context.close()
    context.run()
    context.stop()
    context.open()
}

fun adapterPattern() {
    val adapter: Target = Adapter()
    println(adapter.five)
}

fun okHttpInterceptor() {
    val interceptorList: MutableList<Interceptor> = ArrayList()
    interceptorList.add(RetryAndFollowUpInterceptor())
    interceptorList.add(CallServerInterceptor())
    val originalRequest: Request = object : Request {}
    val chain = ChainImpl(interceptorList, 0, originalRequest)
    chain.process(originalRequest)
}

/**
 * 责任链模式
 */
fun responsibilityChainPattern() {
    val activity = Activity()
    val viewGroup = ViewGroup()
    val view = View()
    activity.setNextHandler(viewGroup)
    viewGroup.setNextHandler(view)
    val event = Event()
    activity.dispatchEvent(event)
}

/**
 * 模板模式
 */
fun templatePattern() {
    val elephantTemplate: AbstractTemplate = ElephantTemplate()
    elephantTemplate.startWork()
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
        val result = method.invoke(subject, *args)
        println("do something after.")
        result
    }
    val subjectProxy = Proxy.newProxyInstance(
        Subject::class.java.classLoader, arrayOf<Class<*>>(Subject::class.java),  // 代理类实现的接口列表
        invocationHandler
    ) as Subject

//        Subject subjectProxy = new $Proxy0(invocationHandler);
    subjectProxy.doSomething()
}

/**
 * 装饰模式
 */
fun decoratorPattern() {
    val concreteComponent = ConcreteComponent()
    val concreteDecorator1 = ConcreteDecorator1(concreteComponent)
    concreteDecorator1.operate()
    val concreteDecorator2 = ConcreteDecorator2(concreteComponent)
    concreteDecorator2.operate()
}

/**
 * 观察者模式
 */
fun observerPattern() {
    val observable = Observable()
    val observer1 = Observer { data: Any ->
        println(
            "observer1...$data"
        )
    }
    observable.addObserver(observer1)
    val observer2 = Observer { data: Any ->
        println(
            "observer2...$data"
        )
    }
    observable.addObserver(observer2)
    observable.notifyAllObservers("notify all observer.")
    observable.notify(observer1, "notify observer1.")
}

/**
 * 回调
 */
fun callback() {
    val button = Button()
    button.setOnClickListener { println("onClick") }
    button.click()
}