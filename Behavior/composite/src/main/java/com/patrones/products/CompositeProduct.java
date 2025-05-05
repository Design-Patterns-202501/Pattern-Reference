package com.patrones.products;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends ProductAbstract {

    private List<ProductAbstract> products = new ArrayList<>();

    public CompositeProduct(String name) {
        super(name, 0);
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (ProductAbstract product: products) {
            sum += product.getPrice();
        }
        double subtotal = sum*ammount;
        return subtotal + subtotal*fee;
    }
    
    @Override
    public void setPrice(double price) {
        throw new UnsupportedOperationException();
    }

    public void addProduct(ProductAbstract product) {
        this.products.add(product);
    }

    public boolean removeProduct(ProductAbstract product) {
        return this.products.remove(product);
    }
};
