package com.example;

/**
 * 具体装饰类
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }

    public void fly() {
        System.out.println("Bird fly");
    }
}
