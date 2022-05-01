package com.gxd.demo.design.pattern.decorator

/**
 * 装饰器模式
 */
fun main() {
    val concreteComponent = ConcreteComponent()
    val concreteDecorator1 = ConcreteDecorator1(concreteComponent)
    concreteDecorator1.operate()
    val concreteDecorator2 = ConcreteDecorator2(concreteComponent)
    concreteDecorator2.operate()
}