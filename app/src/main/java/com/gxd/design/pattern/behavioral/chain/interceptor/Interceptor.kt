package com.gxd.design.pattern.behavioral.chain.interceptor

interface Interceptor {
    fun intercept(chain: Chain): Response
}
