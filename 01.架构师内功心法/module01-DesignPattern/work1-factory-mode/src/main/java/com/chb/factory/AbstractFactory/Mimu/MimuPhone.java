package com.chb.factory.AbstractFactory.Mimu;

import com.chb.factory.AbstractFactory.Phone;

public class MimuPhone implements Phone {
    @Override
    public void call() {
        System.out.println("小米手机打电话...");
    }
}
