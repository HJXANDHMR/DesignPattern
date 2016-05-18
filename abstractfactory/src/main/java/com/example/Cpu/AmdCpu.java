package com.example.Cpu;

import com.example.Cpu.Cpu;

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
