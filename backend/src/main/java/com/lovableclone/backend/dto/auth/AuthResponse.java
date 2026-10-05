package com.lovableclone.backend.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
