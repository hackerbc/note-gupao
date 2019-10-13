package com.chb.singleton.ithreadlocal;

public class ThreadLocalSigleton {
    private static final ThreadLocal<ThreadLocalSigleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSigleton>() {
                @Override
                protected ThreadLocalSigleton initialValue() {
                    return new ThreadLocalSigleton();
                }
            };

    private ThreadLocalSigleton() {
    }

    public static ThreadLocalSigleton getInstance() {
        return threadLocalInstance.get();
    }
}
