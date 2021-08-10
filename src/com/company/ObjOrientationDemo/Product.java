package com.company.ObjOrientationDemo;

public class Product {

    private final String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
