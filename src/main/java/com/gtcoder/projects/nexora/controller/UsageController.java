package com.gtcoder.projects.nexora.controller;

import com.gtcoder.projects.nexora.dto.subscription.PlanLimitsResponse;
import com.gtcoder.projects.nexora.dto.subscription.UsageTodayResponse;
import com.gtcoder.projects.nexora.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {
    private final UsageService usageService;
    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getTodayUsageDfUser(userId));
    }
    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse> getPlansLimits(){
        Long userId=1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
