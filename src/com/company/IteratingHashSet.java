package com.company;
import java.util.*;
import java.util.HashSet;

public class IteratingHashSet {

    public static void main(String args[]){
        HashSet<String> employeeName = new HashSet<String>();

        employeeName.add("Ali Hassan");
        employeeName.add("Qasim Hameed");
        employeeName.add("Shahzaib Durrani");
        employeeName.add("Shahmeer S");
        employeeName.add("Shahmeer S"); //sets will make sure duplicates are eradicated

        Iterator<String> i = employeeName.iterator();

        while(i.hasNext()){
            System.out.println(i.next()); //trying to duplicate foreach loop in python 
        }
    }



}
