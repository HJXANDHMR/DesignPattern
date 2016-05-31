package com.example;

/**
 * Created by Administrator on 2016/5/30.
 */
public class LeTV implements ITV {

    @Override
    public void on() {
        System.out.println("Letv turn on");
    }

    @Override
    public void off() {
        System.out.println("LeTV turn off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("LeTV channel: " + channel);
    }
}
