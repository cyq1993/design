package com.example.design.proxy;

/**
 * @description:
 * @author: cyq
 * @create: 2023/4/2 19:11
 */
public class UserServiceImp implements UserService, UserService2{

    @Override
    public void add() {
        System.out.println("添加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询一个用户");
    }

    @Override
    public void add2() {
        System.out.println("add2 添加一个用户");
    }

    @Override
    public void delete2() {
        System.out.println("add2 删除一个用户");
    }

    @Override
    public void query2() {
        System.out.println("add2 查询一个用户");
    }
}
