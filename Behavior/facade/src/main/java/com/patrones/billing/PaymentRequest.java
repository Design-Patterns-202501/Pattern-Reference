package com.patrones.billing;

public class PaymentRequest {

    private Long clientId;
    private double ammount;
    private String cardNumber;
    private String cardName;
    private String cardExpireDate;
    private String cardSecurityNumber;


    public PaymentRequest() {
    }

	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardExpireDate() {
		return cardExpireDate;
	}
	public void setCardExpireDate(String cardExpireDate) {
		this.cardExpireDate = cardExpireDate;
	}
	public String getCardSecurityNumber() {
		return cardSecurityNumber;
	}
	public void setCardSecurityNumber(String cardSecurityNumber) {
		this.cardSecurityNumber = cardSecurityNumber;
	}
    
}
