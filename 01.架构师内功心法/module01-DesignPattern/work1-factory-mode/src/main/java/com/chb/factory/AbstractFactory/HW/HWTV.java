package com.chb.factory.AbstractFactory.HW;

import com.chb.factory.AbstractFactory.TV;

public class HWTV implements TV {
    @Override
    public void watch() {
        System.out.println("看华为电视");
    }
}
