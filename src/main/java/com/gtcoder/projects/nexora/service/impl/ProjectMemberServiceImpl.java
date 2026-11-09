package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.member.InviteMemberRequest;
import com.gtcoder.projects.nexora.dto.member.MemberResponse;
import com.gtcoder.projects.nexora.dto.member.UpdateMemberRoleRequest;
import com.gtcoder.projects.nexora.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userID) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userID) {
        return null;
    }
}
