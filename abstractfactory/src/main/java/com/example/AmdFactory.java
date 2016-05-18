package com.example;

/**
 * Created by Administrator on 2016/5/17.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard();
    }
}
