package com.example.Factory;

import com.example.Cpu.AmdCpu;
import com.example.Amd.AmdMainboard;
import com.example.Cpu.Cpu;
import com.example.Amd.Mainboard;

/**
 * Created by Administrator on 2016/5/17.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard();
    }
}
