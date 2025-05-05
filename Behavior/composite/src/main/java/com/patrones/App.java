package com.patrones;

import com.patrones.order.SellOrder;

public class App {
    public static void main(String[] args) {
        SellOrder order = new SellOrder("123", "Sebastian");
        System.out.println(order);
    }
}
