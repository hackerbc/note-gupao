package com.chb.adapter.loginadapder.v2.adapters;

import com.chb.adapter.loginadapder.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
