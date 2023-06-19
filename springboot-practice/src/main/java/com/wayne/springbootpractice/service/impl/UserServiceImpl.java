package com.wayne.springbootpractice.service.impl;

import com.wayne.springbootpractice.dao.UserDao;
import com.wayne.springbootpractice.dto.UserRegisterRequest;
import com.wayne.springbootpractice.model.User;
import com.wayne.springbootpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
