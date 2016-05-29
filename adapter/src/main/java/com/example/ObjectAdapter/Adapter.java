package com.example.ObjectAdapter;

import com.example.ClassAdapter.Target;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Adapter implements Target {

    private Adaptee mAdaptee;

    public Adapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        mAdaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }

}
