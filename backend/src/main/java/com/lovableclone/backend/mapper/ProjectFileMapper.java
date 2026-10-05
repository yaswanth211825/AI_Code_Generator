package com.lovableclone.backend.mapper;

import com.lovableclone.backend.dto.project.FileNode;
import com.lovableclone.backend.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
