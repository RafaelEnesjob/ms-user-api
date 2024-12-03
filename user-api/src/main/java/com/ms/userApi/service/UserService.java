package com.ms.userApi.service;

import com.ms.userApi.dto.request.UserRequest;
import com.ms.userApi.dto.response.UserResponse;
import com.ms.userApi.entitie.User;
import com.ms.userApi.mapper.UserMapper;
import com.ms.userApi.repositorie.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ValidadorCpfService validadorCpfService;

    public UserService(UserRepository userRepository, UserMapper userMapper, ValidadorCpfService validadorCpfService) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.validadorCpfService = validadorCpfService;
    }

    @Transactional
    public UserResponse criar(UserRequest userRequest) {
        validadorCpfService.validarCpf(userRequest.getCpf());
        User usuario = userMapper.toEntity(userRequest);
        userRepository.save(usuario);
        return userMapper.toResponse(usuario);
    }


}
