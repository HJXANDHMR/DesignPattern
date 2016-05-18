package com.example;

public class MyClass {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.createProduct("A");
        product.use();
    }
}
