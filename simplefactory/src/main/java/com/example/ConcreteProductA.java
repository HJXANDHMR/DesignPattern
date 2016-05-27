package com.example;

/**
 * 具体产品A
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
