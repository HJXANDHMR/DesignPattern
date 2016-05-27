package com.example.Cpu;


/**
 * Created by Administrator on 2016/5/17.
 */
public class IntelCpu implements Cpu {

    public IntelCpu() {
        System.out.println("Create IntelCpu");
    }

    @Override
    public void calculate() {
        System.out.println("IntelCpu calculate");
    }
}
