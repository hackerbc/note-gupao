package com.chb.factory.AbstractFactory.Mimu;

import com.chb.factory.AbstractFactory.AbstractCourseFactory;
import com.chb.factory.AbstractFactory.Phone;
import com.chb.factory.AbstractFactory.TV;
//
public class MimuFactory implements AbstractCourseFactory {
    @Override
    public TV createTV() {
        return new MimuTV();
    }

    @Override
    public Phone createPhone() {
        return new MimuPhone();
    }
}
