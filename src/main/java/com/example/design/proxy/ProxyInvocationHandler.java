package com.example.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @description:
 * @author: cyq
 * @create: 2023/4/2 19:02
 */
public class ProxyInvocationHandler implements InvocationHandler {
private  Object target;
public void setRent(Object rent){
    this.target = rent;
}
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(target, args);
    }
    void log(String name){
        System.out.println("执行了" + name +"方法");
    }
}
