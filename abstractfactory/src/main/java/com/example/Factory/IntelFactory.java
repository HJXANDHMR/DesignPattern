package com.example.Factory;

import com.example.Cpu.Cpu;
import com.example.Cpu.IntelCpu;
import com.example.Amd.IntelMainboard;
import com.example.Amd.Mainboard;

/**
 * Created by Administrator on 2016/5/17.
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard();
    }
}
