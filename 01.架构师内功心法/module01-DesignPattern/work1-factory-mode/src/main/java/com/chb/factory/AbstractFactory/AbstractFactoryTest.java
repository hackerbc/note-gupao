package com.chb.factory.AbstractFactory;

import com.chb.factory.AbstractFactory.HW.HWFactory;
import com.chb.factory.AbstractFactory.Mimu.MimuFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractCourseFactory factory = new HWFactory();
        factory.createTV().watch();
        factory.createPhone().call();
        factory = new MimuFactory();
        factory.createTV().watch();
        factory.createPhone().call();
    }
}
