package com.chb.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private final static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    private ContainerSingleton(){}

    public static Object getBean(String className){
        if(!ioc.containsKey(className)){
            synchronized (ioc){
                if(!ioc.containsKey(className)){
                    Object obj = null;
                    try {
                        obj = Class.forName(className).newInstance();
                        ioc.put(className,obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return obj;
                }
            }
        }
        return ioc.get(className);
    }
    public static Object getBean(Class clazz){
        return getBean(clazz.getName());
    }
}
