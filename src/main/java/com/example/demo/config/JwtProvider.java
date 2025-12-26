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

    // ✅ Generate token
    public String generateToken(String email, Long userId, Set<String> roles) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        claims.put("roles", roles);

        return jwtUtil.generateToken(claims, email);
    }

    public String getEmailFromToken(String token) {
        return jwtUtil.extractUsername(token);
    }

    public Long getUserIdFromToken(String token) {
        Object id = jwtUtil.extractClaim(token, c -> c.get("userId"));
        return Long.valueOf(id.toString());
    }

    @SuppressWarnings("unchecked")
    public Set<String> getRolesFromToken(String token) {
        return (Set<String>) jwtUtil.extractClaim(token, c -> c.get("roles"));
    }

    public boolean validateToken(String token, String email) {
        return jwtUtil.validateToken(token, email);
    }
}
