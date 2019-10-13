package com.chb.factory.FactoryMethod;

import com.chb.factory.ICourse;
import com.chb.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFacyory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
