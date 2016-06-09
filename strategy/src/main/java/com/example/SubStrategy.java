package com.example;

/**
 * 减法的具体实现策略
 */
public class SubStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute SubStrategy");
        return paramA - paramB;
    }
}
