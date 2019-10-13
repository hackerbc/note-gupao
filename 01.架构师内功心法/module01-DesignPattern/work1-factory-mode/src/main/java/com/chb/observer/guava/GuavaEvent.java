package com.chb.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    //订阅
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行 subscribe 方法,传入的参数是:" + str);
    }
}
