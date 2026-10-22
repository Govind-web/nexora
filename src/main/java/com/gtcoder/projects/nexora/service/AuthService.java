package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.auth.AuthResponse;
import com.gtcoder.projects.nexora.dto.auth.LoginRequest;
import com.gtcoder.projects.nexora.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
