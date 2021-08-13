package com.company.ObjOrientationDemo;

import java.util.Optional;

public class Customer {

    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long ccNumber) {
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public int calculateDiscount() {
        return 0;
    }

    public Optional<Order> checkout(ShoppingCart cart) {
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());
        return payment.map(p -> new Order(this, cart, p));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
