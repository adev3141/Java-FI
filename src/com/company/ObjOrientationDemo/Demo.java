package com.company.ObjOrientationDemo;

public class Demo {
    public static  void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        //Product brush = new Product("Colgate Eaze Brush", 9);
        //Product milk = new Product("Olpers Milk", 6);
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");

        cart.addProduct(brush);
        cart.addProduct(milk);

        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
