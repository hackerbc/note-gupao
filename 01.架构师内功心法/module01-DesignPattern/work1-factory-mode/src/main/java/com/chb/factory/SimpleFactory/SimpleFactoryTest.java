package com.chb.factory.SimpleFactory;

import com.chb.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        factory.create(JavaCourse.class).record();
    }
}
