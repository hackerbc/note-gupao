package com.chb.factory.AbstractFactory.HW;

import com.chb.factory.AbstractFactory.Phone;

public class HWPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机打电话...");
    }
}
