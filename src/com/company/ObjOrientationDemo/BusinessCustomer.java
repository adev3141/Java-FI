package com.company.ObjOrientationDemo;

public class BusinessCustomer extends Customer{
    public enum BusinessSize {SMALL, MEDIUM, LARGE}

    private BusinessSize size;

    public BusinessCustomer(String name, long ccNumber, BusinessSize size) {
        super(name, ccNumber);
        this.size = size;
    }

    @Override
    public int calculateDiscount() {
        switch (size) {
            case SMALL:
                return 5;
            case MEDIUM:
                return 10;
            case LARGE:
                return 20;
            default:
                throw new AssertionError("Unknown size: " + this);
        }
    }

    @Override
    public String toString() {
        return "BusinessCustomer {" +
                super.toString() +
                " size=" + size +
                '}';
    }
}
