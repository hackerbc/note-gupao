package com.chb.observer.iobserver;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收到通知");
    }
}
