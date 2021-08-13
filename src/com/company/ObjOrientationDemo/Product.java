package com.company.ObjOrientationDemo;

public class Product {

    private final String name;
    private int price;
    private int discount;
    private int weight;
    private ProductType type;


    public Product(String name, int price, ProductType type, int weight){
        this.name = name;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }

    public int getPrice(){
        int shippingCost = type.getShippingCost(weight);
        return (int)(price *(100-discount)/100.0);
    }
}
