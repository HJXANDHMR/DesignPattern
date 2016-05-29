package com.example.ClassAdapter;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }

}
