package com.gtcoder.projects.nexora.service;

import com.gtcoder.projects.nexora.dto.subscription.CheckoutRequest;
import com.gtcoder.projects.nexora.dto.subscription.CheckoutResponse;
import com.gtcoder.projects.nexora.dto.subscription.PortalResponse;
import com.gtcoder.projects.nexora.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
