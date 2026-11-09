package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.subscription.PlanResponse;
import com.gtcoder.projects.nexora.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
