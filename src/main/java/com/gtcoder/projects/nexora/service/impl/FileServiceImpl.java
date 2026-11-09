package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.project.FileContentResponse;
import com.gtcoder.projects.nexora.dto.project.FileNode;
import com.gtcoder.projects.nexora.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
