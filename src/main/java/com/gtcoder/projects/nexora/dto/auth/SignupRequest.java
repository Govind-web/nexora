package com.gtcoder.projects.nexora.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
