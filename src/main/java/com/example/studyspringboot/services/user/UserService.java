package com.example.studyspringboot.services.user;

import com.example.studyspringboot.dto.user.User;
import com.example.studyspringboot.services.common.CommonService;

import java.util.List;



public interface UserService extends CommonService {

    void  save(User user);

    int delete(int id);

    User  findUserById(int id);

    int updateUser(User user);

    List<User> findAll();
}
