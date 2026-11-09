package com.gtcoder.projects.nexora.controller;

import com.gtcoder.projects.nexora.dto.project.FileContentResponse;
import com.gtcoder.projects.nexora.dto.project.FileNode;
import com.gtcoder.projects.nexora.dto.project.FileTreeResponse;
import com.gtcoder.projects.nexora.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {
    private final FileService fileService;
    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId=1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId,userId));
    }

    @GetMapping("/{*path}") // /scr/hooks/get-user-hook.jsx
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long projectId,
            @PathVariable String path
    ){
        Long userId=1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId,path,userId));
    }
}
