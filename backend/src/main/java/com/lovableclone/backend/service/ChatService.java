package com.lovableclone.backend.service;


import com.lovableclone.backend.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
