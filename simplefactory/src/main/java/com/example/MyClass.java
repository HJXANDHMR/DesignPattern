package com.example;

public class MyClass {

    public static void main(String[] args) {
        Product product = Factory.createProduct("A");
        product.use();
    }
}
