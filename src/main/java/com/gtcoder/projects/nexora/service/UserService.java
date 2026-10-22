package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
