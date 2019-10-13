package com.chb.proxy.jdkproxy;

import com.chb.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/*
原理：
反编译代理类:
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Customer());
            person.findLove();
            person.toString();

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            byte[] bytes2 = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.write(bytes2);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
