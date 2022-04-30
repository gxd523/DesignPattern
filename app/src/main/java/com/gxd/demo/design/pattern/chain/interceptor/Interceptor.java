package com.gxd.demo.design.pattern.chain.interceptor;

public interface Interceptor {
    Response intercept(Chain chain);
}
