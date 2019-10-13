package com.chb.pattern.deepclone;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;

public class SunWuKong extends Monkey implements Cloneable,Serializable {

    public Jingubang jingubang;

    public Jingubang getJingubang() {
        return jingubang;
    }

    public void setJingubang(Jingubang jingubang) {
        this.jingubang = jingubang;
    }

    public SunWuKong(){}
    public SunWuKong(String name,Jingubang jingubang){
        this.jingubang = jingubang;
        this.name = name;
    }
    //深克隆
    @Override
    protected SunWuKong clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SunWuKong clone = (SunWuKong) ois.readObject();

            return  clone;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /*//浅克隆
    @Override
    protected SunWuKong clone() throws CloneNotSupportedException {
        SunWuKong clone = new SunWuKong();
        clone.setJingubang(this.jingubang);
        clone.setName(this.name);
        return clone;
    }*/
}
