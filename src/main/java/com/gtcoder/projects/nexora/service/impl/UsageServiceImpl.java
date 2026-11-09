package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.subscription.PlanLimitsResponse;
import com.gtcoder.projects.nexora.dto.subscription.UsageTodayResponse;
import com.gtcoder.projects.nexora.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageDfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
