package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.project.ProjectRequest;
import com.gtcoder.projects.nexora.dto.project.ProjectResponse;
import com.gtcoder.projects.nexora.dto.project.ProjectSummaryResponse;
import com.gtcoder.projects.nexora.entity.Project;
import com.gtcoder.projects.nexora.entity.User;
import com.gtcoder.projects.nexora.mapper.ProjectMapper;
import com.gtcoder.projects.nexora.repository.ProjectRepository;
import com.gtcoder.projects.nexora.repository.UserRepository;
import com.gtcoder.projects.nexora.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {
    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;
    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner=userRepository.findById(userId).orElseThrow();
        Project project=Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();
        project=projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
        //return new ProjectResponse(project.getId(),project.getName(),project.getCreatedAt(),project.getUpdatedAt(),project.getOwner());
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

        return projectRepository.findAllAccessibleByUser(userId)
                .stream()
                .map(project -> projectMapper.toProjectSummaryReponse(project))
                .collect(Collectors.toList());
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }


    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
