package com.example.studyspringboot.services.user;

import com.example.studyspringboot.dto.User;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;



public interface UserService {

    void  save(User user);

    int delete(int id);

    User  findUserById(int id);

    int updateUser(User user);

    List<User> findAll();
}
