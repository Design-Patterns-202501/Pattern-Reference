package com.patrones.implementation;

import com.patrones.interfaces.IPrototype;

public class ProductInfo implements IPrototype<ProductInfo> {

    private String name;
    private Double value;


    public ProductInfo() {}

    public ProductInfo(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public Double getValue() { return this.value; }
    public void setValue(Double value) { this.value = value; }

    @Override
    public ProductInfo clone() {
        return new ProductInfo(
                this.name,
                this.value
                );
    }

    @Override
    public ProductInfo deepClone() {
        return this.clone();
    }
    
}
