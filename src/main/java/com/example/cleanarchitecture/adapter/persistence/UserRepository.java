package com.example.cleanarchitecture.adapter.persistence;

import com.example.cleanarchitecture.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
