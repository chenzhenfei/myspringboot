package com.example.studyspringboot.services.user;

import com.example.studyspringboot.dao.user.mapper.UserMapper;
import com.example.studyspringboot.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

//@WebService(serviceName = "UserService",endpointInterface = "com.example.studyspringboot.services.user.UserService")
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
}
