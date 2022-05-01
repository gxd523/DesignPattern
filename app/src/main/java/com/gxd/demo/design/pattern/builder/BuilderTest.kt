package com.gxd.demo.design.pattern.builder

/**
 * 建造者模式
 */
fun main() {
    val person = Person.Builder()
        .setName("Tom")
        .setAge(22)
        .build()
    person.let(::println)
}