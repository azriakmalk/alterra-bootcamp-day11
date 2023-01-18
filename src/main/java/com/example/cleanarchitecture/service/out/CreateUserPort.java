package com.example.cleanarchitecture.service.out;

import com.example.cleanarchitecture.entity.User;

public interface CreateUserPort {
    User createUser(User user);
}
