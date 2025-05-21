package com.patrones.schemas;

public class Card {
    private String prefix;
    private String issuer;
    private CardType type;


    public Card(String prefix, String issuer, CardType type) {
        this.prefix = prefix;
        this.issuer = issuer;
        this.type = type;
    }

	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public CardType getType() {
		return type;
	}
	public void setType(CardType type) {
		this.type = type;
	}
};
