package com.company.ObjOrientationDemo;

public enum ProductType {

    DIGITAL(0), PHYSICAL(Catalogue.SHIPPING_RATE);

    private final int shippingRate;

    ProductType(int shippingRate) {
        this.shippingRate = shippingRate;
    }

    public int getShippingCost(int weight) {
        return shippingRate * weight;
    }
}

