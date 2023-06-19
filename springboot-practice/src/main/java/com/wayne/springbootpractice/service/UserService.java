package com.wayne.springbootpractice.service;

import com.wayne.springbootpractice.dto.UserRegisterRequest;
import com.wayne.springbootpractice.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
