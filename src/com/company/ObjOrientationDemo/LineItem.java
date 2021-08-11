package com.company.ObjOrientationDemo;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return this.product;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    public int getPrice() {
        return product.getPrice() * quantity;
    }
}
