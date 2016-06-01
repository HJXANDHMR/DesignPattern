package com.example;

/**
 * Created by Administrator on 2016/5/31.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }

    @Override
    public void move() {
        // 代码
        sage.move();
    }

}
