package com.chb.strategy.pay.strategy;

public class UnionPay extends Paymeint {
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
