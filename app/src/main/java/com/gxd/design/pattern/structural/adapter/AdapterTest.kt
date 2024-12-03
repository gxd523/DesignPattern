package com.gxd.design.pattern.structural.adapter

/**
 * 适配器模式
 * 通过「适配器」解决「接口」、「类」不「兼容」的问题
 */
fun main() {
    val adapter: Target = Adapter()
    println(adapter.five)
}