package com.gtcoder.projects.nexora.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {
    Project project;
    User user;
    String title;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt; //soft delete

}
