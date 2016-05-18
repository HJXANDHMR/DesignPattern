package com.example;

/**
 * Created by Administrator on 2016/5/18.
 */
public class ConcreteProductA implements Product {

    public ConcreteProductA() {
        System.out.println("Create ConcreteProductA");
    }

    @Override
    public void use() {
        System.out.println("ConcreteProductA Use");
    }
}
