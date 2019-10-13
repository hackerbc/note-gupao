package com.chb.lazy;

//懒汉式
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazySimpleSomgleton;

    public static LazySimpleSingleton getInstance(){
        if (lazySimpleSomgleton == null) {
            lazySimpleSomgleton = new LazySimpleSingleton();
        }
        return lazySimpleSomgleton;
    }
}
