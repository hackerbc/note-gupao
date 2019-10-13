package com.chb.factory.AbstractFactory.Mimu;

import com.chb.factory.AbstractFactory.TV;

public class MimuTV implements TV {
    @Override
    public void watch() {
        System.out.println("看小米电视");
    }
}
