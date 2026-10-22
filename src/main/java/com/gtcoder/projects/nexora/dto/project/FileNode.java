package com.gtcoder.projects.nexora.dto.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modeifiedAt,
        Long size,
        String type
) {
}
