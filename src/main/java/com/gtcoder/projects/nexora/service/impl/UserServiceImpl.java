package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.auth.UserProfileResponse;
import com.gtcoder.projects.nexora.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
