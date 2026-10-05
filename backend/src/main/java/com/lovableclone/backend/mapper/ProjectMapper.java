package com.lovableclone.backend.mapper;

import com.lovableclone.backend.dto.project.ProjectResponse;
import com.lovableclone.backend.dto.project.ProjectSummaryResponse;
import com.lovableclone.backend.entity.Project;
import com.lovableclone.backend.enums.ProjectRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project, ProjectRole role);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
