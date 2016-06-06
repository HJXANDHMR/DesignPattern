package com.example;

/**
 * 　请求者角色类
 */
public class Invoker {

    private Command mCommand;

    public Invoker(Command command) {
        mCommand = command;
    }

    public void action() {
        mCommand.execute();
    }

}
