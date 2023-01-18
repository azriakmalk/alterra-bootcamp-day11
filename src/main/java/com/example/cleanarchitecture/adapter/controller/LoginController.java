package com.example.cleanarchitecture.adapter.controller;

import com.example.cleanarchitecture.entity.User;
import com.example.cleanarchitecture.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    public String generateToken(@RequestBody User user) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid email/password");
        }
        return jwtUtil.generateToken(user.getEmail());
    }
}
