package com.scaler.paymentservice.controllers;

import com.scaler.paymentservice.dtos.PaymentRequestDto;
import com.scaler.paymentservice.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(@Qualifier("stripePaymentGateway") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String createPaymentLink(@RequestBody PaymentRequestDto requestDto) throws StripeException {
        String url = paymentService.createPaymentLink(
                requestDto.getOrderId(),
                requestDto.getAmount());
        return url;
    }

    @PostMapping("/webhook")
    public String handleWebhook(){
        System.out.println("request for webhook received");
        System.out.println("updating database...");
        System.out.println("Webhook completed...");
        return "";
    }
}
