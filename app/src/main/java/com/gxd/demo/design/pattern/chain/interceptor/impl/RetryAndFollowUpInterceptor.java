package com.gxd.demo.design.pattern.chain.interceptor.impl;

import com.gxd.demo.design.pattern.chain.interceptor.Chain;
import com.gxd.demo.design.pattern.chain.interceptor.Interceptor;
import com.gxd.demo.design.pattern.chain.interceptor.Request;
import com.gxd.demo.design.pattern.chain.interceptor.Response;

public class RetryAndFollowUpInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        Request request = ((ChainImpl) chain).request;
        return chain.process(request);
    }
}
