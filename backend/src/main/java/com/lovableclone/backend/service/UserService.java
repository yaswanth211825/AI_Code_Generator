package com.lovableclone.backend.service;

import com.lovableclone.backend.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
