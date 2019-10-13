package com.chb.factory.SimpleFactory;

import com.chb.factory.ICourse;

public class CourseFactory {
    /*public ICourse create(String name){
        if("java".equals(name))
            return new JavaCourse();
        else if("python".equals(name))
            return new PythonCourse();
        return null;
    }*/
    public ICourse create(String className){
        try {
            if(!(null == className || "".equals(className)))
                return (ICourse) Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public ICourse create(Class clzz){
        return create(clzz.getName());
    }
}
