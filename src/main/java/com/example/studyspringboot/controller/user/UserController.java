package com.example.studyspringboot.controller.user;


import com.example.studyspringboot.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
     private UserService userService;

    @RequestMapping("list")
    public List findUserList(){
      return userService.findAll();
    }




}
