package com.lovableclone.backend.service;

import com.lovableclone.backend.dto.subscription.PlanLimitsResponse;
import com.lovableclone.backend.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    void recordTokenUsage(Long userId, int actualTokens);
    void checkDailyTokensUsage();
}
