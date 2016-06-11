package com.example;

/**
 * 沸水
 */
public class BoilingWaterState implements IWaterState {
    @Override
    public void printState() {
        System.out.println("Now state: Boiling Water");
    }
}
