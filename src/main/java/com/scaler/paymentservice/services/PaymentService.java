package com.scaler.paymentservice.services;

import com.stripe.exception.StripeException;

public interface PaymentService {

    public String createPaymentLink(String orderId, Long amount) throws StripeException;
}
