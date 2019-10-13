package com.chb.pattern.shallowclone;

import lombok.Data;

@Data
public class User implements Cloneable{
    private Long id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
