package com.example.cleanarchitecture.adapter.persistence;

import com.example.cleanarchitecture.entity.User;
import com.example.cleanarchitecture.service.out.CreateUserPort;
import com.example.cleanarchitecture.service.out.GetAllUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistence implements CreateUserPort, GetAllUserPort {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
