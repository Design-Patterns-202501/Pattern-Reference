package com.patrones.interfaces;

import com.patrones.billing.PaymentRequest;
import com.patrones.billing.PaymentResponse;
import com.patrones.exceptions.PaymentError;

public interface IPaymentFacade {
    public PaymentResponse payment(PaymentRequest request) throws PaymentError;
}
