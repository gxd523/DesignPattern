package com.gxd.demo.design.pattern.adapter

/**
 * 适配器模式
 */
fun main() {
    val adapter: Target = Adapter()
    println(adapter.five)
}