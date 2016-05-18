package com.example.Factory;

import com.example.Cpu.Cpu;
import com.example.Amd.Mainboard;

/**
 * Created by Administrator on 2016/5/17.
 */
public interface AbstractFactory {

    Cpu createCpu();

    Mainboard createMainboard();
}
