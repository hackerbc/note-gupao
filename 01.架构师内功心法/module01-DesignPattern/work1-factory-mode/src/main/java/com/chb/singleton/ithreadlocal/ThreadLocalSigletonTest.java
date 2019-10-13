package com.chb.singleton.ithreadlocal;

import com.chb.singleton.lazy.ExectorThread;

public class ThreadLocalSigletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSigleton.getInstance());
        System.out.println(ThreadLocalSigleton.getInstance());
        System.out.println(ThreadLocalSigleton.getInstance());
        System.out.println(ThreadLocalSigleton.getInstance());
        System.out.println(ThreadLocalSigleton.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
