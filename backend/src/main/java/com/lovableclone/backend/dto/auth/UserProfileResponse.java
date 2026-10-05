package com.lovableclone.backend.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
