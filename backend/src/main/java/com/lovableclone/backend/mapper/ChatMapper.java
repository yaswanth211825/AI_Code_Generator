package com.lovableclone.backend.mapper;

import com.lovableclone.backend.dto.chat.ChatResponse;
import com.lovableclone.backend.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
