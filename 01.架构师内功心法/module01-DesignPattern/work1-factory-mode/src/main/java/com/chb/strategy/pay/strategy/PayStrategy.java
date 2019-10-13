package com.chb.strategy.pay.strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAT = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAT = ALI_PAT;

    private static Map<String, Paymeint> payStrategy = new HashMap<String, Paymeint>();

    static {
        payStrategy.put(ALI_PAT, new AliPay());
        payStrategy.put(WECHAT_PAY, new WechatPay());
        payStrategy.put(UNION_PAY, new UnionPay());
        payStrategy.put(JD_PAY, new JDPay());
    }

    public static Paymeint get(String payKey){
        if(payStrategy.containsKey(payKey)){
            return payStrategy.get(payKey);
        }
        return payStrategy.get(DEFAULT_PAT);
    }



}
