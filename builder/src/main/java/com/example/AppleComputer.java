package com.example;


public class AppleComputer extends Computer {

    @Override
    public void setCPU(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOs(String os) {
        mOperationSystem = os;
    }
}
