package com.gxd.design.pattern.behavioral.chain.interceptor.impl

import com.gxd.design.pattern.behavioral.chain.interceptor.Chain
import com.gxd.design.pattern.behavioral.chain.interceptor.Interceptor
import com.gxd.design.pattern.behavioral.chain.interceptor.Request
import com.gxd.design.pattern.behavioral.chain.interceptor.Response

class ChainImpl(private val interceptors: List<Interceptor>, val request: Request, private val index: Int = 0) : Chain {
    override fun process(request: Request): Response {
        val interceptor = interceptors[index]
        val chain = ChainImpl(interceptors, request, index + 1)
        return interceptor.intercept(chain)
    }
}
