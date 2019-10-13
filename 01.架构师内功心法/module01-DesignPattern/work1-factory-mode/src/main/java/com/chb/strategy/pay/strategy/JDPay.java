package com.chb.strategy.pay.strategy;

public class JDPay extends Paymeint {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
