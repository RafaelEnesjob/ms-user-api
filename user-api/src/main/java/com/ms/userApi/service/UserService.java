package com.ms.userApi.service;

import com.ms.userApi.dto.request.UserRequest;
import com.ms.userApi.dto.response.UserResponse;
import com.ms.userApi.mapper.UserMapper;
import com.ms.userApi.repositorie.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

//    @Transactional
//    public UserResponse criar(UserRequest userRequest) {
//
//    }


}
