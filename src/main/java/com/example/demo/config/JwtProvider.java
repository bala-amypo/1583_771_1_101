package com.example.demo.config;

import com.example.demo.util.JwtUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class JwtProvider {

    private final JwtUtil jwtUtil;

    public JwtProvider(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    // Generate token
    public String generateToken(String email, Long userId, Set<String> roles) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        claims.put("roles", roles);
        return jwtUtil.createToken(claims, email);
    }

    // ✅ REQUIRED BY TESTS (single-arg)
    public boolean validateToken(String token) {
        String email = getEmailFromToken(token);
        return jwtUtil.validateToken(token, email);
    }

    // Optional (used internally)
    public boolean validateToken(String token, String email) {
        return jwtUtil.validateToken(token, email);
    }

    // Extract email
    public String getEmailFromToken(String token) {
        return jwtUtil.extractUsername(token);
    }

    // ✅ REQUIRED BY TESTS
    public Long getUserId(String token) {
        Object id = jwtUtil.extractClaim(token, claims -> claims.get("userId"));
        if (id instanceof Integer) {
            return ((Integer) id).longValue();
        }
        return (Long) id;
    }
}
