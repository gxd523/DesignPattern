package com.gxd.design.pattern.behavioral.stragety

/**
 * 策略模式
 */
fun main() {
    val addStrategy = AddStrategy()
    val multiplyStrategy = MultiplyStrategy()

    val context = StrategyContext()

    context.setStrategy(addStrategy)
    context.useStrategy(1, 2).let(::println)

    context.setStrategy(multiplyStrategy)
    context.useStrategy(1, 2).let(::println)
}