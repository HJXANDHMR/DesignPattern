package com.example;

public class MyClass {

    public static void main(String[] args) {
        ITV itv = new LeTV();
        LogitechRemoteControl logitechRemoteControl = new LogitechRemoteControl(itv);
        logitechRemoteControl.turnOn();
        logitechRemoteControl.setChannelKeyboard(30);
        logitechRemoteControl.turnOff();
    }
}
