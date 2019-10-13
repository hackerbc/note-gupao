package com.chb.strategy.pay.strategy;

public class WechatPay extends Paymeint {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
