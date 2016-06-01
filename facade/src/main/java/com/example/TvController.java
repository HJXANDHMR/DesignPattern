package com.example;

/**
 * 遥控器
 */
public class TvController {

    private PowerSystem mPowerSystem;
    private VoiceSystem mVoiceSystem;
    private ChannelSystem mChannelSystem;

    public TvController() {
        mPowerSystem = new PowerSystem();
        mVoiceSystem = new VoiceSystem();
        mChannelSystem = new ChannelSystem();
    }

    public void powerOn() {
        mPowerSystem.powerOn();
    }

    public void powerOff() {
        mPowerSystem.powerOff();
    }

    public void turnUp() {
        mVoiceSystem.turnUp();
    }

    public void turnDown() {
        mVoiceSystem.turnDown();
    }

    public void NextChannel() {
        mChannelSystem.next();
    }

    public void PreviousChannel() {
        mChannelSystem.previous();
    }
}
