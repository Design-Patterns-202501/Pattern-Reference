package com.patrones;

import com.patrones.billing.PaymentRequest;
import com.patrones.facade.PaymentFacade;
import com.patrones.interfaces.IPaymentFacade;

public class App {
    public static void main(String[] args) {
        PaymentRequest request = new PaymentRequest();

        request.setAmmount(499);
        request.setCardExpireDate("10/2025");
        request.setCardName("Mo Salah");
        request.setCardNumber("1234567890123456");
        request.setCardSecurityNumber("345");
        request.setClientId(1L);

        try {
            IPaymentFacade paymentFacade = new PaymentFacade();
            paymentFacade.payment(request);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
