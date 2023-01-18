package com.example.cleanarchitecture.service;

import com.example.cleanarchitecture.entity.User;
import com.example.cleanarchitecture.service.in.GetAllUserUseCase;
import com.example.cleanarchitecture.service.out.GetAllUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {
    private final GetAllUserPort getAllUserPort;

    @Override
    public List<User> getAllUser() {
        return getAllUserPort.getAllUser();
    }
}
