package com.example.studyspringboot.controller.proxy;


import com.alibaba.fastjson.JSONArray;
import com.example.studyspringboot.proxy.dynamic.jdkproxy.ProxyFactory;
import com.example.studyspringboot.proxy.stati.UserServiceProxy;
import com.example.studyspringboot.dto.User;
import com.example.studyspringboot.services.user.UserService;
import com.example.studyspringboot.services.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @Autowired
    private UserServiceProxy userServiceProxy;

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/static")
    public String getUserByProxyStatic() {
        List<User> userList = userServiceProxy.findAll();
        String a ="static:" +JSONArray.toJSONString(userList);
        System.out.println("static:"+a);
        return a;
    }

    @RequestMapping("/dynamic")
    public String getUserByProxyDynamic() {
        UserService a = (UserService) new ProxyFactory(userService).getInstance();
        List<User> userList = a.findAll();
        String b = "dynamic:"+JSONArray.toJSONString(userList);
        System.out.println("dynamic:"+b);
        return b;
    }


}
