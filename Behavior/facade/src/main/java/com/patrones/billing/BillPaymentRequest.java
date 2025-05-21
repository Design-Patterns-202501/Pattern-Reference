package com.patrones.billing;

public class BillPaymentRequest {

    private Long clientId;
    private double payment;


    public BillPaymentRequest(Long clientId, double payment) {
        this.clientId = clientId;
        this.payment = payment;
    }

	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}


}
