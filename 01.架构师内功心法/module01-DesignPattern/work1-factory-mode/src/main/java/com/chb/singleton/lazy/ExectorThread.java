package com.chb.singleton.lazy;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
