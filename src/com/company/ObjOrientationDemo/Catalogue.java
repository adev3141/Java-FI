package com.company.ObjOrientationDemo;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    public final static int SHIPPING_RATE = 5;

    private static Map<String,Product> productMap = new HashMap<>();

    static{
        productMap.put("Electric ToothBrush", new Product("Electric ToothBrush", 69,ProductType.PHYSICAL, 1));
        productMap.put("Olpers", new Product("Olpers", 29, ProductType.PHYSICAL, 2));
        productMap.put("Eggs 12pc", new Product("Eggs 12pc", 690, ProductType.PHYSICAL, 3));
        productMap.put("Water 12 litter", new Product("Water 12 litter", 239,ProductType.PHYSICAL, 15));
        productMap.put("National Chicken Spread", new Product("National Chicken Spread", 109,ProductType.DIGITAL, -1));
        productMap.put("Citizen Watch", new Product("Citizen Watch", 23469, ProductType.PHYSICAL, 14));
        productMap.put("Notebook Movie", new Product("Notebook Movie", 369, ProductType.DIGITAL, -1));
        productMap.put("Electric Wheel Chair", new Product("Electric Wheel Chair", 60009, ProductType.PHYSICAL, 100));
        productMap.put("Lemon Tart", new Product("Lemon Tart", 150, ProductType.PHYSICAL, 1));
    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
