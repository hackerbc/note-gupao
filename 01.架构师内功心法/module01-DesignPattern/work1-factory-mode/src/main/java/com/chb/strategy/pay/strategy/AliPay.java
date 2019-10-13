package com.chb.strategy.pay.strategy;

public class AliPay extends Paymeint {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
