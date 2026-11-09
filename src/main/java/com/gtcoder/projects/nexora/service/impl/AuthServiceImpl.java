package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.auth.AuthResponse;
import com.gtcoder.projects.nexora.dto.auth.LoginRequest;
import com.gtcoder.projects.nexora.dto.auth.SignupRequest;
import com.gtcoder.projects.nexora.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
