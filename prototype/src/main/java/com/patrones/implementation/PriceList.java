package com.patrones.implementation;

import java.util.ArrayList;
import java.util.List;

import com.patrones.interfaces.IPrototype;

public class PriceList implements IPrototype<PriceList> {

    private String list;
    private List<ProductInfo> products = new ArrayList<>();

    public PriceList(String list) {
        this.list = list;
    }

    public String getList() { return this.list; }
    public void setList(String list) { this.list = list; }

    public List<ProductInfo> getProducts() { return this.products; }
    public void setProducts(List<ProductInfo> products) { this.products = products; }

    public void addProduct(ProductInfo product) { this.products.add(product); }


    @Override
    public PriceList clone() {
        PriceList clone = new PriceList(list);
        clone.setProducts(this.products);
        return clone;
    }


    @Override
    public PriceList deepClone() {
        List<ProductInfo> cloneProducts = new ArrayList<>();

        for (ProductInfo item: this.products) {
            ProductInfo nw = item.clone();
            cloneProducts.add(nw);
        }

        PriceList clone = new PriceList(list);
        clone.setProducts(cloneProducts);
        return clone;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        res.append(list + " { ");
        for (ProductInfo item: products) {
            res.append(item.getName() + " - " + item.getValue().toString());
            res.append(" , ");
        }

        res.append(" }");

        return res.toString();
    }
}
