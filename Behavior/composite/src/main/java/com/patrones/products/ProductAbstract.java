package com.patrones.products;

public abstract class ProductAbstract {

    protected String name;
    protected double price;
    protected double fee;
	protected double ammount;

	public ProductAbstract(String name, double price) {
        this.name = name;
        this.price = price;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		double subtotal = ammount*price;
        return subtotal + subtotal*fee;
	}
	public void setPrice(double price) {
		this.price = price;
	} 

    public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
    public double getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
};
