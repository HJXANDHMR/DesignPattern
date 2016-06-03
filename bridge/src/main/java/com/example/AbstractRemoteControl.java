package com.example;

/**
 * 抽象类
 */
public abstract class AbstractRemoteControl {

    private ITV mITV;

    public AbstractRemoteControl(ITV ITV) {
        mITV = ITV;
    }

    public void turnOn() {
        mITV.on();
    }

    public void turnOff() {
        mITV.off();
    }

    public void setChannel(int channel) {
        mITV.switchChannel(channel);
    }
}
