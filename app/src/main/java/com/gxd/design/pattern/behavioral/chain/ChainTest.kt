package com.gxd.design.pattern.behavioral.chain

import com.gxd.design.pattern.behavioral.chain.event.Event
import com.gxd.design.pattern.behavioral.chain.event.impl.Activity
import com.gxd.design.pattern.behavioral.chain.event.impl.View
import com.gxd.design.pattern.behavioral.chain.event.impl.ViewGroup
import com.gxd.design.pattern.behavioral.chain.interceptor.Request
import com.gxd.design.pattern.behavioral.chain.interceptor.impl.CallServerInterceptor
import com.gxd.design.pattern.behavioral.chain.interceptor.impl.ChainImpl
import com.gxd.design.pattern.behavioral.chain.interceptor.impl.RetryAndFollowUpInterceptor

fun main() {
    responsibilityChainPattern()
    okHttpInterceptor()
}

/**
 * 责任链模式
 */
fun responsibilityChainPattern() {
    val activity = Activity()
    val viewGroup = ViewGroup()
    val view = View()
    activity.setNextHandler(viewGroup)
    viewGroup.setNextHandler(view)
    val event = object : Event {}
    activity.dispatchEvent(event)
}

fun okHttpInterceptor() {
    val interceptorList = listOf(RetryAndFollowUpInterceptor(), CallServerInterceptor())
    val originalRequest: Request = object : Request {}
    val chain = ChainImpl(interceptorList, originalRequest)
    chain.process(originalRequest)
}