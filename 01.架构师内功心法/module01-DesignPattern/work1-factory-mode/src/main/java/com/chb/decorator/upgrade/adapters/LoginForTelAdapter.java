package com.chb.decorator.upgrade.adapters;

import com.chb.adapter.loginadapder.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
