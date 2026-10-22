package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.project.FileContentResponse;
import com.gtcoder.projects.nexora.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
