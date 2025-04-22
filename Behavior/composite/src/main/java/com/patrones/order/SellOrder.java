package com.patrones.order;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.patrones.products.ProductAbstract;

public class SellOrder {
    private String orderCode;
    private String client;
    private List<ProductAbstract> products = new ArrayList<>();

    public SellOrder(String orderCode, String client) {
        super();
        this.orderCode = orderCode;
        this.client = client;
    }

    public double getPrice() {
        double sum = 0d;
        for (ProductAbstract product: products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void addProduct(ProductAbstract product) {
        this.products.add(product);
    }

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public List<ProductAbstract> getProducts() {
		return products;
	}

	public void setProducts(List<ProductAbstract> products) {
		this.products = products;
	}

    public void printOrder() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\\\n============================================="
                + "\nCodigo_Orden: " + this.orderCode + "\nCliente: " + this.client 
                + "\nProductos:\n");
        for (ProductAbstract prod : products) {
            System.out.println(prod.getName() + "\t\t\t$ " 
                    + formater.format(prod.getPrice()));
        }
        System.out.println("Total: " + formater.format(getPrice()) 
                + "\n=============================================");
    }
};
