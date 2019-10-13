package com.chb.proxy.jdkproxy;

import com.chb.proxy.Person;

public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高 180cm");
        System.out.println("胸大，6 块腹肌");
    }
}
