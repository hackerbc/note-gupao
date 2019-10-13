package com.chb.singleton.lazy;

import java.io.Serializable;

//这种形式兼顾饿汉式的内存浪费，也兼顾 synchronized 性能问题
//完美地屏蔽了这两个缺点
public class LazyInnerClassSingleton  {
    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance() {
    //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //静态内部类在被调用时加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}