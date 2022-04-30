package com.gxd.demo.design.pattern.chain.interceptor.impl;

import com.gxd.demo.design.pattern.chain.interceptor.Chain;
import com.gxd.demo.design.pattern.chain.interceptor.Interceptor;
import com.gxd.demo.design.pattern.chain.interceptor.Response;

public class CallServerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        return new Response() {
        };
    }
}
