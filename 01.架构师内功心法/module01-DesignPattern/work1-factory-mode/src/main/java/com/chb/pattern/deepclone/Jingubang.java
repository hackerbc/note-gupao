package com.chb.pattern.deepclone;

import lombok.Data;

import java.io.Serializable;

public class Jingubang implements Serializable {

    public String name;
    public Jingubang(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
