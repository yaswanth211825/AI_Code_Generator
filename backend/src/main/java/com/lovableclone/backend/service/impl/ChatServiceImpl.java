package com.lovableclone.backend.service.impl;

import com.lovableclone.backend.dto.chat.ChatResponse;
import com.lovableclone.backend.entity.ChatMessage;
import com.lovableclone.backend.entity.ChatSession;
import com.lovableclone.backend.entity.ChatSessionId;
import com.lovableclone.backend.mapper.ChatMapper;
import com.lovableclone.backend.repository.ChatMessageRepository;
import com.lovableclone.backend.repository.ChatSessionRepository;
import com.lovableclone.backend.security.AuthUtil;
import com.lovableclone.backend.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatSessionRepository chatSessionRepository;
    private final AuthUtil authUtil;
    private final ChatMapper chatMapper;

    @Override
    public List<ChatResponse> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMapper.fromListOfChatMessage(chatMessageList);
    }
}
