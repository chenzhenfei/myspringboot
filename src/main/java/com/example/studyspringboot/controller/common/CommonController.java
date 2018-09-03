package com.example.studyspringboot.controller.common;


import com.example.studyspringboot.services.common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class CommonController {
    @Autowired
    private CommonService commonService;

    @RequestMapping("/index")
    public String testProfile(){
        return commonService.testProfile();
    }

}
