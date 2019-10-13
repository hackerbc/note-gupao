package com.chb.singleton.ienum;

/*
枚举式单例
疑问：提供了data的get，set方法，还是单例？
答：这里的单例是指EnumSingleton，而不是data
 */
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
