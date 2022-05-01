package com.gxd.demo.design.pattern.observer

import com.gxd.demo.design.pattern.observer.callback.Button

fun main() {
    callback()
    observerPattern()
}

/**
 * 观察者模式
 */
fun observerPattern() {
    val observable = Observable()
    val observer1 = Observer { data: Any ->
        println("observer1...$data")
    }
    observable.addObserver(observer1)
    val observer2 = Observer { data: Any ->
        println("observer2...$data")
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