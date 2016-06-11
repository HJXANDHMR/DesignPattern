package com.example;

public class MyClass {

    public static void main(String[] args) {
        IWaterState iWaterState;
        WaterContext waterContext = new WaterContext();
        //模拟状态改变
        for (int i = 0; i < 3; i++) {
            waterContext.setIWaterState(i);
            iWaterState = waterContext.getIWaterState();
            System.out.println("i=" + i);
            iWaterState.printState();
        }
    }
}
