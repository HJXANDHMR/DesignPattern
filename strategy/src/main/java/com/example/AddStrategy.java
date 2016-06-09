package com.example;

/**
 * 加法的具体实现策略
 */
public class AddStrategy implements Strategy {

    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute AddStrategy");
        return paramA + paramB;
    }
}
