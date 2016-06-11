package com.example;

/**
 * 温水
 */
public class WarmWaterState implements IWaterState {
    @Override
    public void printState() {
        System.out.println("Now state: Warm Water");
    }
}
