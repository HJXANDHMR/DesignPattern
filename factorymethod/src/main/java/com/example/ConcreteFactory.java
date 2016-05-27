package com.example;

/**
 * Created by Administrator on 2016/5/27.
 */
public class ConcreteFactory implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
