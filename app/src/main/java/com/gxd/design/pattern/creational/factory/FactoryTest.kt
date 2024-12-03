package com.gxd.design.pattern.creational.factory

import com.gxd.design.pattern.creational.factory.phone.OnePlusPhone
import com.gxd.design.pattern.creational.factory.phone.Phone
import com.gxd.design.pattern.creational.factory.phone.SamsungPhone
import com.gxd.design.pattern.creational.factory.phonefactory.ConcretePhoneFactory

/**
 * 抽象工厂模式
 */
fun main() {
    var phone: Phone
    val phoneFactory = ConcretePhoneFactory()

    phone = phoneFactory.createPhone(SamsungPhone::class.java)
    phone.call()
    phone.sendMessage()
    phone = phoneFactory.createPhone(OnePlusPhone::class.java)
    phone.call()
    phone.sendMessage()
}