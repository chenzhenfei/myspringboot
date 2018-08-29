package com.example.studyspringboot.proxy.dynamic.jdkproxy;


import com.example.studyspringboot.services.user.UserService;
import com.example.studyspringboot.services.user.UserServiceImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyFactory proxy = new ProxyFactory(userService);
        UserService u = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), proxy);
        u.findAll();
    }
}
