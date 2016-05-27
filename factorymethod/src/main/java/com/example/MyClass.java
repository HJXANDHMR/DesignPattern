package com.example;

public class MyClass {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.use();
    }
}
