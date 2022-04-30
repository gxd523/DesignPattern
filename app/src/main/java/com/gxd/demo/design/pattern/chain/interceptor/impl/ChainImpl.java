package com.gxd.demo.design.pattern.chain.interceptor.impl;

import com.gxd.demo.design.pattern.chain.interceptor.Chain;
import com.gxd.demo.design.pattern.chain.interceptor.Interceptor;
import com.gxd.demo.design.pattern.chain.interceptor.Request;
import com.gxd.demo.design.pattern.chain.interceptor.Response;

import java.util.List;

public class ChainImpl implements Chain {
    public final Request request;
    private final int index;
    private final List<Interceptor> interceptors;

    public ChainImpl(List<Interceptor> interceptors, int index, Request request) {
        this.interceptors = interceptors;
        this.request = request;
        this.index = index;
    }

    @Override
    public Response process(Request request) {
        Interceptor interceptor = interceptors.get(index);

        return interceptor.intercept(new ChainImpl(interceptors, index + 1, request));
    }
}
