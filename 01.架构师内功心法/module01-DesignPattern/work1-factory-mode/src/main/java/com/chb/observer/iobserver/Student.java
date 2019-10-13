package com.chb.observer.iobserver;

import java.util.Observable;

public class Student extends Observable {

    public void run(){
        System.out.println("通知老师");
        setChanged();
        notifyObservers();
    }
}
