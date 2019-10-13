package com.chb.decorator.battercake;

//煎饼装饰器
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
