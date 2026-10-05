package com.lovableclone.backend.dto.member;

import com.lovableclone.backend.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole role,
        Instant invitedAt
) {
}
