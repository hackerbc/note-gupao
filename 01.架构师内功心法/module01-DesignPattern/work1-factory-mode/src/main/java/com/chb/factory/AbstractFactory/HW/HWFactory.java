package com.chb.factory.AbstractFactory.HW;

import com.chb.factory.AbstractFactory.AbstractCourseFactory;
import com.chb.factory.AbstractFactory.Phone;
import com.chb.factory.AbstractFactory.TV;

public class HWFactory implements AbstractCourseFactory {
    @Override
    public TV createTV() {
        return new HWTV();
    }

    @Override
    public Phone createPhone() {
        return new HWPhone();
    }
}
