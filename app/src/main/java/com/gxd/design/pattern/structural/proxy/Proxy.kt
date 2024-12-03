package com.gxd.design.pattern.structural.proxy

class Proxy(private val realSubject: Subject): Subject {
    override fun doSomething(param: String) {
        println("Proxy: do before")
        realSubject.doSomething(param)
        println("Proxy: do after")
    }
}