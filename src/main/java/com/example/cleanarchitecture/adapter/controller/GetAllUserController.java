package com.example.cleanarchitecture.adapter.controller;

import com.example.cleanarchitecture.entity.User;
import com.example.cleanarchitecture.service.in.GetAllUserUseCase;
import com.example.cleanarchitecture.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class GetAllUserController {
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    private final GetAllUserUseCase getAllUserUseCase;

    @GetMapping
    public List<User> getAllUser() {
        return getAllUserUseCase.getAllUser();
    }
}
