package com.chb.singleton.lazy;

import java.lang.reflect.Constructor;

//懒汉式
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            //强制访问私有构造方法
            constructor.setAccessible(true);
            //暴力初始化对象
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
