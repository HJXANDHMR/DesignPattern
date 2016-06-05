package com.example;

/**
 * Created by Administrator on 2016/6/5.
 */
public class ProxyObject implements AbstractObject {

    private RealObject mRealObject =new RealObject();

    @Override
    public void operation() {
        System.out.println("Before operation");
        mRealObject.operation();
        System.out.println("After operation");
    }
}
