package com.example;

/**
 * Created by Administrator on 2016/5/30.
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
