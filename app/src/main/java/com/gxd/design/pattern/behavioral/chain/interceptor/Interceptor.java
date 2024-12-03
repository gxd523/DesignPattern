package com.gxd.design.pattern.behavioral.chain.interceptor;

public interface Interceptor {
    Response intercept(Chain chain);
}
