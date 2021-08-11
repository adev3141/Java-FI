package com.company.ObjOrientationDemo;

import java.util.*;

public class ShoppingCart {

    private List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem){
        lineItems.add(lineItem);
    }

    public int getTotalCost(){
        return lineItems.stream()
                .mapToInt(LineItem::getPrice)
                .sum();
    }
}
