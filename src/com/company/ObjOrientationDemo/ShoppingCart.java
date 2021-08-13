package com.company.ObjOrientationDemo;

import javax.sound.sampled.Line;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCart {

    private List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem){
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems(){
        return lineItems.stream()
                .map(LineItem::new)
                .collect(Collectors.toList());
    }

    public int getTotalCost(){
        return lineItems.stream()
                .mapToInt(LineItem::getPrice)
                .sum();
    }
}
