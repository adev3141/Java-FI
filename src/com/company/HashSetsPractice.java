package com.company;
import java.util.HashSet;

public class HashSetsPractice {
    //each item in hashset is unique
    // if item is repeated it is not added to the list
    // hashset is a collection

    public static void main(String args[]){

        HashSet<String> cars = new HashSet<String>();

        cars.add("Beemer");
        cars.add("BBMMW");
        cars.add("TOYOTA");
        cars.add("HONDA");
        cars.add("SUZUKI");
        cars.add("KIA");
        cars.add("DODGE");

        Boolean carContainer = cars.contains("Zebra");

        System.out.println(carContainer);

        cars.remove("KIA");

        System.out.println(cars.contains("KIA"));

        cars.clear();
        System.out.println(cars);

        cars.add("Beemer");
        cars.add("BBMMW");
        cars.add("TOYOTA");
        cars.add("HONDA");
        cars.add("SUZUKI");
        cars.add("KIA");
        cars.add("DODGE");
        cars.add("DODGE");
        cars.add("DODGE");
        cars.add("DODGE");


        System.out.println(cars.size());


    }
}
