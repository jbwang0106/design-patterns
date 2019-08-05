package com.suidyi.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class aClass = null;
    // 被代理的实例
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(this.obj, args);
        if ("login".equalsIgnoreCase(method.getName())) {
            System.out.println("有人在用我的账户登录...");
        }
        return o;
    }
}
