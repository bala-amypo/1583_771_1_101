package com.example.demo.config;

import com.example.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtProvider {

    @Autowired
    private JwtUtil jwtUtil;

    // Generate token with email, userId, and roles
    public String generateToken(String email, Long userId, Set<String> roles) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        claims.put("roles", roles);
        return jwtUtil.createToken(claims, email);  // Use JwtUtil to create token
    }

    // Validate token for email
    public boolean validateToken(String token, String email) {
        return jwtUtil.validateToken(token, email);
    }

    // Extract email (username) from token
    public String getEmailFromToken(String token) {
        return jwtUtil.extractUsername(token);
    }

    // Extract userId from token
    public Long getUserId(String token) {
        Object id = jwtUtil.extractClaim(token, claims -> claims.get("userId"));
        if (id instanceof Integer) {
            return ((Integer) id).longValue();
        }
        return (Long) id;
    }

    // Extract roles from token
    @SuppressWarnings("unchecked")
    public Set<String> getRolesFromToken(String token) {
        Object roles = jwtUtil.extractClaim(token, claims -> claims.get("roles"));
        return roles != null ? (Set<String>) roles : Set.of();
    }
}
