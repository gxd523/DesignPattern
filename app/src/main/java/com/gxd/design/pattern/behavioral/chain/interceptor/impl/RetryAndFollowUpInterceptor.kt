package com.gxd.design.pattern.behavioral.chain.interceptor.impl;

import com.gxd.design.pattern.behavioral.chain.interceptor.Chain;
import com.gxd.design.pattern.behavioral.chain.interceptor.Interceptor;
import com.gxd.design.pattern.behavioral.chain.interceptor.Request;
import com.gxd.design.pattern.behavioral.chain.interceptor.Response;

public class RetryAndFollowUpInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        Request request = ((ChainImpl) chain).request;
        return chain.process(request);
    }
}
