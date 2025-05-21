package com.patrones;

import com.patrones.order.SellOrder;
import com.patrones.products.*;

public class App {
    public static void main(String[] args) {
        SellOrder order = new SellOrder("123", "Sebastian");
        ProductAbstract product = new SimpleProduct("HOME PC", 2000, "HP");
        ProductAbstract product2 = new SimpleProduct("HOME PC 2", 1000, "DELL");

        product.setFee(0.19);
        product2.setFee(0.11);


        CompositeProduct composite = new CompositeProduct("Paquete");

        composite.addProduct(product);
        composite.addProduct(product2);

        composite.setFee(0.2);

        order.addProduct(composite);

        order.printOrder();
    }
}
