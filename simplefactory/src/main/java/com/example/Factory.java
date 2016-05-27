package com.example;


public class Factory {

    public Product createProduct(String s) {

        if (s == "A") {
            return new ConcreteProductA();
        } else if (s == "B") {
            return new ConcreteProductB();
        }
        return null;
    }
}
