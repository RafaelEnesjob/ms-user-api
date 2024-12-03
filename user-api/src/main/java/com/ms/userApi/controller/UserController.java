package com.ms.userApi.controller;

import com.ms.userApi.dto.request.UserRequest;
import com.ms.userApi.dto.response.UserResponse;
import com.ms.userApi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> criarUsuario(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = userService.criar(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }
}
