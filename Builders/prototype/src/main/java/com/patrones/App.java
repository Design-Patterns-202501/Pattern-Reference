package com.patrones;

import com.patrones.factory.PrototypeFactory;
import com.patrones.implementation.PriceList;
import com.patrones.implementation.ProductInfo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PriceList standard = new PriceList("Standard list");

        for (int c = 1; c < 6; c++) {
            ProductInfo item = new ProductInfo("Product " + c, c*2.0);
            standard.addProduct(item);
        }

        PrototypeFactory.addPrototype(standard.getList(), standard);

        // Creating cloned list
        PriceList mayorList = (PriceList) PrototypeFactory.getPrototype("Standard list");

        mayorList.setList("Mayor list");

        for (ProductInfo product: mayorList.getProducts()) {
            product.setValue( product.getValue() * 0.9 );
        }

        PrototypeFactory.addPrototype(mayorList.getList(), mayorList);


        // Reto
        
        PriceList colIvaList = (PriceList) PrototypeFactory.getPrototype("Standard list");


        colIvaList.setList("IVA 19");
        for (ProductInfo item: colIvaList.getProducts()) {
            item.setValue( item.getValue() * 1.19 );
        }

        PrototypeFactory.addPrototype(colIvaList.getList(), colIvaList);


        // 5% de IVA

        PriceList fiveIvaList = (PriceList) PrototypeFactory.getPrototype("Standard list");

        fiveIvaList.setList("IVA 5");
        for (ProductInfo item: fiveIvaList.getProducts()) {
            item.setValue( item.getValue() * 1.05 );
        }

        PrototypeFactory.addPrototype(fiveIvaList.getList(), fiveIvaList);

        System.out.println(standard);
        System.out.println(colIvaList);
        System.out.println(fiveIvaList);
    }
}
