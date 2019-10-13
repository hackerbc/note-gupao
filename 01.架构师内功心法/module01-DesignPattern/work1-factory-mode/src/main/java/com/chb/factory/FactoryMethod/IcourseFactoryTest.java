package com.chb.factory.FactoryMethod;

public class IcourseFactoryTest {
    public static void main(String[] args) {
        ICourseFacyory facyory = new PythonCourseFactory();
        facyory.create().record();
        facyory = new JavaCourseFactory();
        facyory.create().record();
    }
}
