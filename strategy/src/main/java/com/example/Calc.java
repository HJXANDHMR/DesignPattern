package com.example;

/**
 * 进行计算操作的上下文环境
 */
public class Calc {

    private Strategy mStrategy;

    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public double calc(double paramA, double paramB) {
        if (mStrategy == null) {
            throw new IllegalStateException("You haven't set the strategy for computing.");
        }
        return mStrategy.calc(paramA, paramB);
    }
}
