package com.example;


public class Director {
    public Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(int cpu, int ram, String os) {
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }

}
