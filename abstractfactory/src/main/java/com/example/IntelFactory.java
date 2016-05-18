package com.example;

/**
 * Created by Administrator on 2016/5/17.
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard();
    }
}
