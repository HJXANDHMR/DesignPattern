package com.example;

/**
 * Created by Administrator on 2016/6/8.
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("ConcreteSubject State:" + state);

        //状态发生改变，通知观察者
        nodifyObservers(state);
    }
}
