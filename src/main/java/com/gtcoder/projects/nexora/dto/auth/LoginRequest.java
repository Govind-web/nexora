package com.gtcoder.projects.nexora.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
