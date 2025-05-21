package com.patrones.billing;

public class PaymentResponse {

    private String paymentConfirmCode;
    private double newBalance;
    private String clientState;

    public PaymentResponse(String code, double balance, String state) {
        this.paymentConfirmCode = code;
        this.newBalance = balance;
        this.clientState = state;
    }

	public String getPaymentConfirmCode() {
		return paymentConfirmCode;
	}

	public void setPaymentConfirmCode(String paymentConfirmCode) {
		this.paymentConfirmCode = paymentConfirmCode;
	}

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}

	public String getClientState() {
		return clientState;
	}

	public void setClientState(String clientState) {
		this.clientState = clientState;
	}
    
}
