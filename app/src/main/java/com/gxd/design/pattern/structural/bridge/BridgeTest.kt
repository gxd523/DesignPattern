package com.gxd.design.pattern.structural.bridge

/**
 * 桥接模式
 */
fun main() {
    val yellowColor = YellowColor()
    val redColor = RedColor()

    val wallet = Wallet()
    val handbag = Handbag()

    println(Bag(yellowColor, wallet).name)
    println(Bag(yellowColor, handbag).name)
    println(Bag(redColor, wallet).name)
    println(Bag(redColor, handbag).name)
}