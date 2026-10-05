package com.lovableclone.backend.repository;

import com.lovableclone.backend.entity.ChatSession;
import com.lovableclone.backend.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}
