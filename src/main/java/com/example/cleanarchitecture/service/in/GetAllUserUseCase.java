package com.example.cleanarchitecture.service.in;

import com.example.cleanarchitecture.entity.User;

import java.util.List;

public interface GetAllUserUseCase {
    List<User> getAllUser();
}
