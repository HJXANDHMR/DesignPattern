package com.example;

/**
 * Created by Administrator on 2016/5/31.
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        super.move();
        System.out.println("Bird Move");
    }

    public void fly() {
        System.out.println("Bird fly");
    }
}
