package com.example;

/**
 * Created by Administrator on 2016/5/28.
 */
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
