package com.company.ObjOrientationDemo;

import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static  void main(String[] args){
        /**
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

        order.ifPresent(Demo::fulfil);

        System.out.println(order);
         **/

        Customer ismatTahira = new Customer("Jane Doe", 4534347);
        Customer aliHassan = new BusinessCustomer("Ali Hassan", 91806, BusinessCustomer.BusinessSize.LARGE);
        Customer Shaheen = new BusinessCustomer("Shaheen", 453227, BusinessCustomer.BusinessSize.LARGE);
        Customer MusafirFoundation = new NonprofitCustomer("Musafir Foundation", 4534997);

        List<Customer> customers = new ArrayList<>();
        customers.add(ismatTahira);
        customers.add(aliHassan);
        customers.add(Shaheen);
        customers.add(MusafirFoundation);


        //count how many customers are on each discount rate

        Map<Integer, Long> discountMap = customers.stream()
                .collect(Collectors
                        .groupingBy(Customer::calculateDiscount, Collectors.counting()));

        System.out.println(discountMap);


    }
    public static void fulfil(Order o) {

        ShoppingCart cart = o.getCart();

        boolean shippingUnfinished;

        do {
            shippingUnfinished = false;
            for (LineItem li : cart.getLineItems()) {
                boolean fulfilHalf = Math.random() > 0.7;
                if (fulfilHalf) {
                    li.setQuantity(li.getQuantity()/2);
                    shippingUnfinished = true;
                } else {
                    li.setQuantity(0);
                }

                System.out.println(fulfilHalf);
            }
        } while (shippingUnfinished);
    }
}
