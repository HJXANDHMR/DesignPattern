package com.example;

public class MyClass {

    public static void main(String[] args) {
        ITV itv = new LeTV();
        LogitechRemoteControl logitechRemoteControl = new LogitechRemoteControl(itv);
        logitechRemoteControl.setChannelKeyboard(30);
    }
}
