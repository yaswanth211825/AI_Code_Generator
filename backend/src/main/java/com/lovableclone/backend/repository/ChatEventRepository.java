package com.lovableclone.backend.repository;

import com.lovableclone.backend.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository extends JpaRepository<ChatEvent, Long> {
}
