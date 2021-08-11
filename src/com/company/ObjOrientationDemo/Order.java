package com.company.ObjOrientationDemo;

public class Order {

    private final Customer customer;
    private final ShoppingCart cart;
    private final Payment payment;

    public Order(Customer customer, ShoppingCart cart, Payment payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

}
