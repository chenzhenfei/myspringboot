package com.example.studyspringboot.services.user;

import com.example.studyspringboot.dao.repository.user.UserMapper;
import com.example.studyspringboot.dto.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@WebService(serviceName = "UserService",endpointInterface = "UserService")
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public String testProfile() {
        return "userServiceImple";
    }
}
