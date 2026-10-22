package com.gtcoder.projects.nexora.controller;

import com.gtcoder.projects.nexora.dto.member.InviteMemberRequest;
import com.gtcoder.projects.nexora.dto.member.MemberResponse;
import com.gtcoder.projects.nexora.dto.member.UpdateMemberRoleRequest;
import com.gtcoder.projects.nexora.entity.ProjectMember;
import com.gtcoder.projects.nexora.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/members")
@RequiredArgsConstructor
public class ProjectMemberController {
    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMembers(@PathVariable Long projectId){
        Long userId=1L;
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId,userId));
    }
    @PostMapping("/{userId}")
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request
    ){
        Long userId=1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(
                projectMemberService.inviteMember(projectId,request,userId)
        );
    }
    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody UpdateMemberRoleRequest request
    ){
        Long userID=1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId,memberId,request,userID));
    }
    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    ){
        Long userID=1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId,memberId,userID));
    }
}
