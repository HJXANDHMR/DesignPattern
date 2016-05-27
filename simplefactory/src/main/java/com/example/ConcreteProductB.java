package com.example;

/**
 * 具体产品B
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
