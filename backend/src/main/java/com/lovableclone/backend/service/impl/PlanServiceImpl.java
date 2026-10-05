package com.lovableclone.backend.service.impl;

import com.lovableclone.backend.dto.subscription.PlanResponse;
import com.lovableclone.backend.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
