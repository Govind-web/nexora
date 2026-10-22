package com.gtcoder.projects.nexora.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    Long id;
    String email;
    String passwordHash;
    String name;
    String avatarUrl;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt; //soft delete

}
