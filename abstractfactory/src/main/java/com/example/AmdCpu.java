package com.example;

/**
 * Created by Administrator on 2016/5/17.
 */
public class AmdCpu implements Cpu {

    public AmdCpu() {
        System.out.println("Create AmdCpu");
    }

    @Override
    public void calculate() {
        System.out.println("AmdCpu");
    }
}
