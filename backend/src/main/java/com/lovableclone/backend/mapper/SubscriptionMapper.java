package com.lovableclone.backend.mapper;

import com.lovableclone.backend.dto.subscription.PlanResponse;
import com.lovableclone.backend.dto.subscription.SubscriptionResponse;
import com.lovableclone.backend.entity.Plan;
import com.lovableclone.backend.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
