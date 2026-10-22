package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
