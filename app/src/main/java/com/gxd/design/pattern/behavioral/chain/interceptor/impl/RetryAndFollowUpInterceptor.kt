package com.gxd.design.pattern.behavioral.chain.interceptor.impl

import com.gxd.design.pattern.behavioral.chain.interceptor.Chain
import com.gxd.design.pattern.behavioral.chain.interceptor.Interceptor
import com.gxd.design.pattern.behavioral.chain.interceptor.Response

class RetryAndFollowUpInterceptor : Interceptor {
    override fun intercept(chain: Chain): Response {
        val request = (chain as ChainImpl).request
        return chain.process(request)
    }
}
