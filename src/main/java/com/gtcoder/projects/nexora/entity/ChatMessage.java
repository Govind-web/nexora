package com.gtcoder.projects.nexora.entity;


import com.gtcoder.projects.nexora.entity.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    ChatSession chatSession;
    String content;
    MessageRole role;
    String toolCalls; //JSON Array of Tools called no usage
    Integer tokensUsed;
    Instant createdAt;


}
