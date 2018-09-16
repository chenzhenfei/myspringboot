package com.example.studyspringboot.proxy.stati;

import com.example.studyspringboot.dto.user.User;
import com.example.studyspringboot.services.user.UserService;
import com.example.studyspringboot.services.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 静态代理
 */

@Service
public class UserServiceProxy implements UserService{

    @Autowired
    private UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService_arg) {
        this.userService = userService_arg;
    }

    @Override
    public void save(User user) {
        userService.save(user);
    }

    @Override
    public int delete(int id) {
        System.out.println("代理开始");
        int a =userService.delete(id);
        System.out.println("代理结束");
        return a ;
    }

    @Override
    public User findUserById(int id) {
       return userService.findUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userService.updateUser(user);
    }

    @Override
    public List<User> findAll() {
        return  userService.findAll();
    }

    public static void main(String[] args) {
        UserServiceImpl u =new UserServiceImpl();
        UserServiceProxy us = new UserServiceProxy(u);
        us.findAll();
    }

}
