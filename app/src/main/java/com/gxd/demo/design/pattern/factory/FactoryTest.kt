package com.gxd.demo.design.pattern.factory

import com.gxd.demo.design.pattern.factory.phone.OnePlusPhone
import com.gxd.demo.design.pattern.factory.phone.Phone
import com.gxd.demo.design.pattern.factory.phone.SamsungPhone
import com.gxd.demo.design.pattern.factory.phonefactory.ConcretePhoneFactory

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