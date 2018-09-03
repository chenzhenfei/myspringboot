package com.example.studyspringboot.proxy.dynamic.cglibproxy;

import com.example.studyspringboot.dto.user.User;

/**
 * cglib 测试
 */
public class CglibProxyDemo {

    public static void main(String[] args) {
        User u =new User();
        User a = (User) new CglibProxy().getInstance(u);
        a.setName("aaa");
        System.out.println(a.getName());
    }

}
