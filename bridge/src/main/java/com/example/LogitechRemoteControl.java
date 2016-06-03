package com.example;

/**
 * 扩充类抽象接口
 */
public class LogitechRemoteControl extends AbstractRemoteControl {
    public LogitechRemoteControl(ITV ITV) {
        super(ITV);
    }

    public void setChannelKeyboard(int channel) {
        System.out.println("LogitechRemoteControl setChannelKeyboard   " + channel);
        setChannel(channel);

    }

}
