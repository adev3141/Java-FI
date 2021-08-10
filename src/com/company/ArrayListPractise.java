package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractise {
    //resizeable array, in java.util package


    public  static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Hell cat");
        cars.add("Lambo");
        cars.add("Merc");
        cars.add("G Wagon");
        cars.add("S Series");
        cars.add("Beemer");

        System.out.println(cars);

        System.out.println(cars.get(0));
        cars.set(0,"challenger");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));
        System.out.println(cars.size());


        for(String i : cars){
            System.out.println("Iterating through the loop: " + i);
        }
        //Sorting a String Array List

        Collections.sort(cars);

        System.out.println(cars);


        //other types of arraylist:
        // rule is that a wrapper class must be specified
        // Integer for int
        // Character for char
        // Boolean for boolean
        // Double for double

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(33);
        numbers.add(2);
        numbers.add(87);
        numbers.add(1);
        numbers.add(00);
        numbers.add(877);

        System.out.print("The number are as follows : ");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.print("The number after sorting are as follows : ");
        System.out.println(numbers);

    }

}
