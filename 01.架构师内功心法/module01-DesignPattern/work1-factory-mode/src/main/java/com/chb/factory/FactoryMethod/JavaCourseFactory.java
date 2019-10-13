package com.chb.factory.FactoryMethod;

import com.chb.factory.ICourse;
import com.chb.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFacyory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
