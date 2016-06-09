package com.example;

/**
 * 乘法的具体实现策略
 */
public class MultiStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute MultiStrategy");
        return paramA * paramB;
    }
}
