package com.example.cleanarchitecture.adapter.controller;

import com.example.cleanarchitecture.entity.User;
import com.example.cleanarchitecture.service.in.CreateUserUseCase;
import com.example.cleanarchitecture.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
@RequiredArgsConstructor
public class CreateUserController {
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;
    private final CreateUserUseCase createUserUseCase;

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        return createUserUseCase.createUser(user);
    }
}
