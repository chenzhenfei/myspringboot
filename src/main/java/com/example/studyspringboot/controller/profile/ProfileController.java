package com.example.studyspringboot.controller.profile;


import com.example.studyspringboot.services.common.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private ProfileService commonService;

    @RequestMapping("/index")
    public String testProfile(){
        return commonService.getProfile();
    }

}
