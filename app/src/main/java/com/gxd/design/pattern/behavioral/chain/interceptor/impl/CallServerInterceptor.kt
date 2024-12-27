package com.gxd.design.pattern.behavioral.chain.interceptor.impl;

import com.gxd.design.pattern.behavioral.chain.interceptor.Chain;
import com.gxd.design.pattern.behavioral.chain.interceptor.Interceptor;
import com.gxd.design.pattern.behavioral.chain.interceptor.Response;

public class CallServerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        return new Response() {
        };
    }
}
