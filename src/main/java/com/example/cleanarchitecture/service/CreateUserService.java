package com.example.cleanarchitecture.service;

import com.example.cleanarchitecture.entity.User;
import com.example.cleanarchitecture.service.in.CreateUserUseCase;
import com.example.cleanarchitecture.service.out.CreateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {

    private final CreateUserPort createUserPort;

    @Override
    public User createUser(User user) {
        return createUserPort.createUser(user);
    }
}
