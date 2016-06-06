package com.example;

/**
 * 具体命令角色类
 */
public class ConcreteCommand implements Command {

    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
