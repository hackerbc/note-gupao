package com.chb.pattern.deepclone;

public class SunwukongTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        SunWuKong sunWuKong = new SunWuKong("孙悟空", new Jingubang("如意金箍棒"));
        SunWuKong clone = sunWuKong.clone();
        System.out.println(sunWuKong.getJingubang());
        System.out.println(clone.getJingubang());
        System.out.println(clone.getJingubang()==sunWuKong.getJingubang());

    }
}
