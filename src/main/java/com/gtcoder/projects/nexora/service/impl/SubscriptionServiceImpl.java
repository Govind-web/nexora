package com.gtcoder.projects.nexora.service.impl;

import com.gtcoder.projects.nexora.dto.subscription.CheckoutRequest;
import com.gtcoder.projects.nexora.dto.subscription.CheckoutResponse;
import com.gtcoder.projects.nexora.dto.subscription.PortalResponse;
import com.gtcoder.projects.nexora.dto.subscription.SubscriptionResponse;
import com.gtcoder.projects.nexora.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
