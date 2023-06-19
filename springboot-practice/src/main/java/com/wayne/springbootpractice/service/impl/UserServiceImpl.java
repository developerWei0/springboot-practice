package com.wayne.springbootpractice.service.impl;

import com.wayne.springbootpractice.dao.UserDao;
import com.wayne.springbootpractice.dto.UserRegisterRequest;
import com.wayne.springbootpractice.model.User;
import com.wayne.springbootpractice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        // 檢查註冊的email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if(user!=null){
            log.warn("該 email {} 已經被註冊 {}", userRegisterRequest.getEmail(),"Judy");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //創見帳號
        return userDao.createUser(userRegisterRequest);
    }
}
