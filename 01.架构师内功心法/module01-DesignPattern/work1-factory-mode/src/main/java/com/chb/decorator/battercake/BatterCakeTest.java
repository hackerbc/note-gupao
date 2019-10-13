package com.chb.decorator.battercake;

public class BatterCakeTest {
    public static void main(String[] args) {
        BaseBattercake baseBattercake = new BaseBattercake();
        EggDecorator eggDecorator = new EggDecorator(baseBattercake);
        System.out.println(eggDecorator.getMsg() + ",总价：" + eggDecorator.getPrice());
    }
}
