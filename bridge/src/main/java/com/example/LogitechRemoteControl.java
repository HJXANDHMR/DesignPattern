package com.example;

/**
 * Created by Administrator on 2016/5/30.
 */
public class LogitechRemoteControl extends AbstractRemoteControl {
    public LogitechRemoteControl(ITV ITV) {
        super(ITV);
    }

    public void setChannelKeyboard(int channel) {
        setChannel(channel);
        System.out.println("LogitechRemoteControl setChannelKeyboard");
    }

}
