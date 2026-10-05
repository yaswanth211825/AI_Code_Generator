package com.lovableclone.backend.service;

import com.lovableclone.backend.dto.project.ProjectRequest;
import com.lovableclone.backend.dto.project.ProjectResponse;
import com.lovableclone.backend.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectSummaryResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
