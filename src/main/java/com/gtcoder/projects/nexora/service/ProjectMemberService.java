package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.member.InviteMemberRequest;
import com.gtcoder.projects.nexora.dto.member.MemberResponse;
import com.gtcoder.projects.nexora.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userID);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userID);
}
