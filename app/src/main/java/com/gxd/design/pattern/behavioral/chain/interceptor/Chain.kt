package com.gxd.design.pattern.behavioral.chain.interceptor

interface Chain {
    fun process(request: Request): Response
}
