package com.example.Cpu;



public class AmdCpu implements Cpu {

    public AmdCpu() {
        System.out.println("Create AmdCpu");
    }

    @Override
    public void calculate() {
        System.out.println(" AmdCpu installCpu");
    }
}
