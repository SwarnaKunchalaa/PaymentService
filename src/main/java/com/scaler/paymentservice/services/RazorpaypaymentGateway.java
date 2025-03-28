package com.scaler.paymentservice.services;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

//import static sun.security.jca.JCAUtil.CachedSecureRandomHolder.instance;

@Service("razorpaypaymentGateway")
public class RazorpaypaymentGateway implements PaymentService{

    @Override
    public String createPaymentLink(String orderId, Long amount) {
//        //make a call to Razorpay to generate the payment link
//        RazorpayClient instance = new RazorpayClient();
//        JSONObject paymentLinkRequest = new JSONObject();
//        paymentLinkRequest.put("amount",1000);
//        paymentLinkRequest.put("currency","INR");
//        paymentLinkRequest.put("accept_partial",true);
//        paymentLinkRequest.put("first_min_partial_amount",100);
//        paymentLinkRequest.put("expire_by",1691097057);
//        paymentLinkRequest.put("reference_id","TS1989");
//        paymentLinkRequest.put("description","Payment for policy no #23456");
//        JSONObject customer = new JSONObject();
//        customer.put("name","+919999999999");
//        customer.put("contact","Gaurav Kumar");
//        customer.put("email","gaurav.kumar@example.com");
//        paymentLinkRequest.put("customer",customer);
//        JSONObject notify = new JSONObject();
//        notify.put("sms",true);
//        notify.put("email",true);
//        paymentLinkRequest.put("reminder_enable",true);
//        JSONObject notes = new JSONObject();
//        notes.put("policy_name","Jeevan Bima");
//        paymentLinkRequest.put("notes",notes);
//        paymentLinkRequest.put("callback_url","https://example-callback-url.com/");
//        paymentLinkRequest.put("callback_method","get");
//
//        PaymentLink payment = instance.paymentLink.create(paymentLinkRequest);
       return "";
    }
}
