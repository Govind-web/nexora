package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.project.ProjectRequest;
import com.gtcoder.projects.nexora.dto.project.ProjectResponse;
import com.gtcoder.projects.nexora.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
