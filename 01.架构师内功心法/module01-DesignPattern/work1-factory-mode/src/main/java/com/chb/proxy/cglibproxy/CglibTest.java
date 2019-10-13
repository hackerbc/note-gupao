package com.chb.proxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

public class CglibTest {
    public static void main(String[] args) {
        //利用 cglib 的代理类可以将内存中的 class 文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://cglib_proxy_class/");
        Customer customer = (Customer)new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
