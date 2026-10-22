package com.gtcoder.projects.nexora.dto.member;

import com.gtcoder.projects.nexora.entity.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
