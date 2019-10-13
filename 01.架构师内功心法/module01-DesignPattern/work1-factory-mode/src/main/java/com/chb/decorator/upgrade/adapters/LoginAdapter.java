package com.chb.decorator.upgrade.adapters;

import com.chb.adapter.loginadapder.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
