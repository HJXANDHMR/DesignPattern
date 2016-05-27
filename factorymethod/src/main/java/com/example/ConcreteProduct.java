package com.example;

/**
 * Created by Administrator on 2016/5/27.
 */
public class ConcreteProduct implements Product {

    public ConcreteProduct() {
        System.out.println("ConcreteProduct Create");
    }

    @Override
    public void use() {
        System.out.println("ConcreteProduct use");
    }
}
