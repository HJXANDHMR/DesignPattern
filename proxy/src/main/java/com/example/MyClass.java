package com.example;

public class MyClass {

    public static void main(String[] args) {
        AbstractObject abstractObject = new ProxyObject();
        abstractObject.operation();
    }
}
