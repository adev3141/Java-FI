package com.company.ObjOrientationDemo;

import java.util.Map;

public class Catalogue {

    private static Map<String,Product> productMap = new Hashmap;

    static{
        productMap.put("Electric ToothBrush", new Product("Electric ToothBrush", 69));
        productMap.put("Olpers", new Product("Olpers", 29));
        productMap.put("Eggs 12pc", new Product("Eggs 12pc", 690));
        productMap.put("Water 12 litter", new Product("Water 12 litter", 239));
        productMap.put("National Chicken Spread", new Product("National Chicken Spread", 109));
        productMap.put("Citizen Watch", new Product("Citizen Watch", 23469));
        productMap.put("Notebook Movie", new Product("Notebook Movie", 369));
        productMap.put("Electric Wheel Chair", new Product("Electric Wheel Chair", 60009));
        productMap.put("Lemon Tart", new Product("Lemon Tart", 150));
    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
