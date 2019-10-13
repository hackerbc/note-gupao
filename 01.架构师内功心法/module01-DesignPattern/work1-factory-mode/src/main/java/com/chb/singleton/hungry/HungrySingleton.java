package com.chb.singleton.hungry;

//饿汉式
public class HungrySingleton {
    //先静态，后动态
    //先属性，后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    /*static {
        hungrySingleton = new HungrySingleton();
    }*/
    private HungrySingleton(){}

    //Instance:实例
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
