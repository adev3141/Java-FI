package com.company.ObjOrientationDemo;

import java.util.Optional;

public class Customer {

    private final String name;
    private CreditCard creditCard;

    public Optional<Order> checkout(ShoppingCart cart){
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());

        return payment.isPresent() ? Optional.of(new Order(this,cart, payment.get())) : Optional.empty();
        //return payment.map(value -> new Order(this,cart,value));
    }

    public Customer(String name, long ccNumber){
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }
}
