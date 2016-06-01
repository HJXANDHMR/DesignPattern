package com.example;

public class MyClass {

    public static void main(String[] args) {

        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.turnUp();
        tvController.turnDown();
        tvController.NextChannel();
        tvController.PreviousChannel();
        tvController.powerOff();
    }
}
