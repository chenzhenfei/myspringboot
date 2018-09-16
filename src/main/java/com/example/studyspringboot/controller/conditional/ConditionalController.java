package com.example.studyspringboot.controller.conditional;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping("/conditional")
public class ConditionalController {

    @GetMapping
    public String index(){
        return "";
    }

}
