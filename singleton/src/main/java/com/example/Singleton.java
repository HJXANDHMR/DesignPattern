package com.example;

/**
 * Created by Administrator on 2016/5/29.
 */
public class Singleton {
    private static Singleton sSingleton;

    //将构造函数私有化
    private Singleton() {
    }

    //提供一个全家的静态方法
    public static Singleton getSingleton() {
        if (sSingleton == null) {
            sSingleton = new Singleton();
        }
        return sSingleton;
    }

    public void singletonOperation() {
        System.out.println("singletonOperation");
    }
}
