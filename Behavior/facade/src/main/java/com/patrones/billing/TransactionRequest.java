package com.patrones.billing;

public class TransactionRequest {

    private double ammount;
    private String cardNumber;
    private String cardName;
    private String cardExpireDate;
    private String cardSecurityNumber;

    public TransactionRequest(double ammount, String number, String name, String date, String securityNumber) {
        this.ammount = ammount;
        this.cardNumber = number;
        this.cardName = name;
        this.cardExpireDate = date;
        this.cardSecurityNumber = securityNumber;
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
