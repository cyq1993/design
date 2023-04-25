package com.example.design.proxy;

/**
 * @description:
 * @author: cyq
 * @create: 2023/4/2 19:10
 */
public class Test {
    public static void main(String[] args) {
        /**JDK 实现动态代理*/
        UserServiceImp user = new UserServiceImp();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(user);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        //目标类实现多个接口时，通过强制转换代理不同接口的方法
        UserService2 proxy2 = (UserService2) pih.getProxy();
        proxy2.add2();

        /**Cglib 方式实现动态代理*/
        UserServiceCglib cglib = new UserServiceCglib();
        cglib.setTarget(user);
        UserService proxyCglib = (UserService) cglib.getProxy();
        proxyCglib.add();
    }
}
