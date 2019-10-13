package com.chb.proxy.gpproxy;

import com.chb.proxy.Person;
import com.chb.proxy.jdkproxy.Customer;

public class GPProxyTest {
    public static void main(String[] args) {
        Person p = (Person) new GPMeipo().getInstance(new Customer());
        p.findLove();

    }
}
