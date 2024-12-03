package com.gxd.design.pattern.structural.proxy

class RealSubject : Subject {
    override fun doSomething(param: String) {
        println("RealSubject: Handling...$param")
    }
}