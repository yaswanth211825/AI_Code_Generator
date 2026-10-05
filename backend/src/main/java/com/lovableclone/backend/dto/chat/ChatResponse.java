package com.lovableclone.backend.dto.chat;

import com.lovableclone.backend.entity.ChatEvent;
import com.lovableclone.backend.entity.ChatSession;
import com.lovableclone.backend.enums.MessageRole;

import java.time.Instant;
import java.util.List;

public record ChatResponse(
        Long id,
        MessageRole role,
        List<ChatEventResponse> events,
        String content,
        Integer tokensUsed,
        Instant createdAt

) {
}
