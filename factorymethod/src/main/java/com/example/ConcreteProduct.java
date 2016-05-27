package com.example;


public class ConcreteProduct implements Product {

    public ConcreteProduct() {
        System.out.println("ConcreteProduct Create");
    }

    @Override
    public void use() {
        System.out.println("ConcreteProduct use");
    }
}
