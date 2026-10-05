package com.lovableclone.backend.service;

import com.lovableclone.backend.dto.project.FileContentResponse;
import com.lovableclone.backend.dto.project.FileNode;
import com.lovableclone.backend.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
