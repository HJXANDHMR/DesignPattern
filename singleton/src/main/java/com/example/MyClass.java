package com.example;

public class MyClass {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.singletonOperation();
    }
}
