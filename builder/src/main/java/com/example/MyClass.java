package com.example;

public class MyClass {

    public static void main(String[] args) {
        Builder builder = new ApplePCBuilder();
        Director director =new Director(builder);
        director.construct(4,8,"Window7");
        System.out.println(builder.create().toString());
    }
}
