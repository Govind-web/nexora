package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.subscription.PlanLimitsResponse;
import com.gtcoder.projects.nexora.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageDfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
