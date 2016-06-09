package com.example;

public class MyClass {

    public double calc(Strategy strategy, double paramA, double paramB) {
        Calc calc = new Calc();
        calc.setStrategy(strategy);
        return calc.calc(paramA, paramB);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("Calculation Add  " + myClass.calc(new AddStrategy(), 10, 5));
        System.out.println("Calculation Add  " + myClass.calc(new SubStrategy(), 10, 5));
        System.out.println("Calculation Add  " + myClass.calc(new MultiStrategy(), 10, 5));
        System.out.println("Calculation Add  " + myClass.calc(new DivStrategy(), 10, 5));
    }
}
