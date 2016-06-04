package com.example;

/**
 * 具体装饰类
 */
public class Fish extends Change {

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
//        super.move();
        System.out.println("Fish Move");
    }

    public void swim() {
        System.out.println("Fish swim");
    }
}
