package com.patrones.exceptions;

public class PaymentError extends Exception {
    public PaymentError(String msg) {
        super(msg);
    }
}
