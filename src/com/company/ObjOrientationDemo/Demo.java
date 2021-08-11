package com.company.ObjOrientationDemo;

import java.util.Optional;

public class Demo {
    public static  void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        Product etoothbrush = Catalogue.getProduct("Electric ToothBrush");
        Product olpers = Catalogue.getProduct("Olpers");
        Product water = Catalogue.getProduct("Water 12 litter");


        cart.addLineItem(new LineItem(olpers, 1));
        cart.addLineItem(new LineItem(water, 1));

        LineItem etoothbrushes = new LineItem(etoothbrush,4);

        cart.addLineItem(etoothbrushes);

        System.out.println(cart.getTotalCost());

        Customer aliHassan = new Customer("Ali Hassan", 1233423532);

        Optional<Order> order = aliHassan.checkout(cart);

        System.out.println(order);

    }
}
