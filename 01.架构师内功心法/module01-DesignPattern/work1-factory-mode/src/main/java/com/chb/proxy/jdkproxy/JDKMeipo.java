package com.chb.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
jdk媒婆
jdk动态代理：实现InvocationHandler接口
target:目标
1.代理类实现InvocationHandler.invoke方法
2.调用Proxy.newProxyInstance(类加载器,类实现接口和对象,当前代理类)生成代理对象，jdk生成的代理对象重写类的父接口方法findLove()
2.1.调用代理findLove方法(重写后的findLove方法，会调用代理的invoke方法)

 */
public class JDKMeipo implements InvocationHandler {
    //被代理对象
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        /*
        getClassLoader：获得类的加载器
        getInterfaces:获取当前类的实现对象或接口
         */
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
}
