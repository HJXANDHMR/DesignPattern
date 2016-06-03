package com.example;

/**
 * 具体实现类
 */
public class XiaoMiTV implements ITV {

    @Override
    public void on() {
        System.out.println("XiaoMiTV turn on");
    }

    @Override
    public void off() {
        System.out.println("XiaoMiTV turn off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("XiaoMiTV channel: " + channel);
    }
}
