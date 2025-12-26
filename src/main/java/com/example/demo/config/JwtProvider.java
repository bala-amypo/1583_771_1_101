package com.example.demo.config;

import com.example.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class JwtProvider {

    @Autowired
    private JwtUtil jwtUtil;

    public String generateToken(String email, Long userId, Set<String> roles) {
        return jwtUtil.generateToken(email, userId, roles);
    }

    public boolean validateToken(String token) {
        return jwtUtil.validateToken(token);
    }

    public String getEmailFromToken(String token) {
        return jwtUtil.getEmailFromToken(token);
    }

    public Long getUserId(String token) {
        return jwtUtil.getUserIdFromToken(token);
    }
}
