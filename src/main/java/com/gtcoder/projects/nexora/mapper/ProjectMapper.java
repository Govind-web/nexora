package com.gtcoder.projects.nexora.mapper;

import com.gtcoder.projects.nexora.dto.project.ProjectResponse;
import com.gtcoder.projects.nexora.dto.project.ProjectSummaryResponse;
import com.gtcoder.projects.nexora.entity.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);
    ProjectSummaryResponse toProjectSummaryReponse(Project project);
}
