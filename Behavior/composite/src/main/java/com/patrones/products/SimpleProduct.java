package com.patrones.products;

public class SimpleProduct extends ProductAbstract {
    private String brand;
    
    SimpleProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
};
