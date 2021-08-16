package com.company.StrategyPattern;

public class StrategyPatternDemo {

    public static void main(String[] args){

        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5,10));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(5,10));

        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(5,10));
    }
}
