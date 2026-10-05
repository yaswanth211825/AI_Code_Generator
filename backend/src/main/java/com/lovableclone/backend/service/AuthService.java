package com.lovableclone.backend.service;

import com.lovableclone.backend.dto.auth.AuthResponse;
import com.lovableclone.backend.dto.auth.LoginRequest;
import com.lovableclone.backend.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
