package com.example.Cpu;



public class IntelCpu implements Cpu {

    public IntelCpu() {
        System.out.println("Create IntelCpu");
    }

    @Override
    public void calculate() {
        System.out.println("IntelCpu calculate");
    }
}
