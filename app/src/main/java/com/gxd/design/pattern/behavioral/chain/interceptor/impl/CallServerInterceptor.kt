package com.gxd.design.pattern.behavioral.chain.interceptor.impl

import com.gxd.design.pattern.behavioral.chain.interceptor.Chain
import com.gxd.design.pattern.behavioral.chain.interceptor.Interceptor
import com.gxd.design.pattern.behavioral.chain.interceptor.Response

class CallServerInterceptor : Interceptor {
    override fun intercept(chain: Chain): Response = object : Response {}
}
