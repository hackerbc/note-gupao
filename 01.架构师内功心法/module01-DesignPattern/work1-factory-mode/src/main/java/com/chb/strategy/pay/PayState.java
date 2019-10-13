package com.chb.strategy.pay;

//支付状态
public class PayState {

    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }


    @Override
    public String toString(){ return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data); }
}
