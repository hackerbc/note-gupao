package com.chb.proxy.dbroute.proxy;

import com.chb.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    Object proxyObj;

    public Object getInstance(Object proxyObj){
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object result = method.invoke(proxyObj,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("Proxy after method 还原默认数据源");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    private void before(Object target) {
        System.out.println(target);
        try{
            //切换数据源
            System.out.println("Proxy before method 切换数据源");
            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){e.printStackTrace();}
    }
}
