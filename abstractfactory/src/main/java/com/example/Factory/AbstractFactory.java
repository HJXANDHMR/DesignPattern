package com.example.Factory;

import com.example.Cpu.Cpu;
import com.example.Mainboard.Mainboard;


public interface AbstractFactory {

    Cpu createCpu();

    Mainboard createMainboard();
}
