package com.wayne.springbootpractice.dao;

import com.wayne.springbootpractice.dto.UserRegisterRequest;
import com.wayne.springbootpractice.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
