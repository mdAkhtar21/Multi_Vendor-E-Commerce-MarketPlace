package com.example.Multi_Vendor.E_Commerce.Marketplace.model;


import com.example.Multi_Vendor.E_Commerce.Marketplace.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String razorPaymentLinkId;
    private String razorPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentid;
    private PaymentStatus stutus;
}
