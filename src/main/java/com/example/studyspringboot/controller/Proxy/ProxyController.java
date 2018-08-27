package com.example.studyspringboot.controller.Proxy;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy")
public class ProxyController {


    @RequestMapping("/index")
    public String getProxy() {
        return "text Proxy";

    }
}
