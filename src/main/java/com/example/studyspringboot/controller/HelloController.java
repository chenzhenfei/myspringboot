package com.example.studyspringboot.controller;

import com.example.studyspringboot.config.redisconfig.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/index")
    public String getIndex(){

        return (String)redisUtils.get("a");

    }



}
