package com.chb.proxy.gpproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
代理类的约束接口
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args) throws InvocationTargetException, IllegalAccessException;
}
