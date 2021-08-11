package com.company.ObjOrientationDemo;

import java.util.UUID;

public class Payment {
    private final CreditCard creditCard;
    private final UUID transactionId;
    private int value;

    public Payment(CreditCard creditCard, int value, UUID transactionId) {
        this.creditCard = creditCard;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", value=" + value +
                ", transactionId=" + transactionId +
                '}';
    }
}
