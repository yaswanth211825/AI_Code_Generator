package com.lovableclone.backend.service;

import com.lovableclone.backend.dto.subscription.CheckoutRequest;
import com.lovableclone.backend.dto.subscription.CheckoutResponse;
import com.lovableclone.backend.dto.subscription.PortalResponse;
import com.stripe.model.StripeObject;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
