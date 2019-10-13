package com.chb.decorator.battercake;

//未修饰的煎饼
public class BaseBattercake extends Battercake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
