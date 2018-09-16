package com.example.studyspringboot.services.user;

import com.example.studyspringboot.dto.user.User;

import java.util.List;



public interface UserService {

    void  save(User user);

    int delete(int id);

    User  findUserById(int id);

    int updateUser(User user);

    List<User> findAll();
}
