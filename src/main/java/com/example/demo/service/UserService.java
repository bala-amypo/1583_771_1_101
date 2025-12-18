package com.example.demo.service;

import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.UserRegisterDto;
import com.example.demo.model.User;

public interface UserService {
    AuthResponse register(UserRegisterDto dto);
    User getByEmail(String email);
}