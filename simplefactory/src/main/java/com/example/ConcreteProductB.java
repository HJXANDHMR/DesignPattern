package com.example;


public class ConcreteProductB implements Product {

    public ConcreteProductB() {
        System.out.println("Create ConcreteProductB");
    }

    @Override
    public void use() {
        System.out.println("ConcreteProductB Use");
    }
}
