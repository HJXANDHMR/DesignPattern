package com.example;


public class ApplePCBuilder extends Builder {

    private Computer mComputer = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mComputer.setCPU(core);
    }

    @Override
    public void buildRAM(int gb) {
        mComputer.setRAM(gb);
    }

    @Override
    public void buildOs(String os) {
        mComputer.setOs(os);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
