package com.example;

public class MyClass {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        //孙悟空变成一只鸟
        Bird bird = new Bird(sage);
        bird.move();
        bird.fly();

        //孙悟空变成一只鱼
        Fish fish = new Fish(sage);
        fish.move();
        fish.swim();
    }
}
