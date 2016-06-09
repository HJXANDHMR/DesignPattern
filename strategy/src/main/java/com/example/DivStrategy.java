package com.example;

/**
 * 除法的具体实现策略
 */
public class DivStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute DivStrategy");
        if (paramB == 0) {
            throw new IllegalArgumentException("Cannot divide into 0");
        }
        return paramA / paramB;
    }
}
