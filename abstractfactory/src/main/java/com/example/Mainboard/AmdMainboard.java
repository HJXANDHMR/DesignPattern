package com.example.Mainboard;

/**
 * Created by Administrator on 2016/5/17.
 */
public class AmdMainboard implements Mainboard {

    public AmdMainboard() {
        System.out.println("Create AmdMainboard");
    }

    @Override
    public void installCpu() {
        System.out.println(" AmdMainboard installCpu");
    }
}
