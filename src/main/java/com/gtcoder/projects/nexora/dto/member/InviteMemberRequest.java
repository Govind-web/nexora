package com.gtcoder.projects.nexora.dto.member;

import com.gtcoder.projects.nexora.entity.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
