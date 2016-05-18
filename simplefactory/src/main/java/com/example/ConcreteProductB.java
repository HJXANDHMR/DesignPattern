package com.example;

/**
 * Created by Administrator on 2016/5/18.
 */
public class ConcreteProductB implements Product {

    public ConcreteProductB() {
        System.out.println("Create ConcreteProductB");
    }

    @Override
    public void use() {
        System.out.println("ConcreteProductB Use");
    }
}
