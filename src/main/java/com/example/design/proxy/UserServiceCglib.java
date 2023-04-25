package com.example.design.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: cyq
 * @create: 2023/4/25 19:35
 */
public class UserServiceCglib implements MethodInterceptor {
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("通过Cglib 动态代理执行方法 " + method.getName());
        return method.invoke(target, args);
    }
}
