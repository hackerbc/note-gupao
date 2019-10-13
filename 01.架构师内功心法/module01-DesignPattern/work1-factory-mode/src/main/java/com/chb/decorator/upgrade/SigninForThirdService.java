package com.chb.decorator.upgrade;

import com.chb.adapter.loginadapder.ResultMsg;

public class SigninForThirdService extends IsigninForThirdService {

    private SiginService signin;

    public SigninForThirdService(SiginService iSignin) {
        this.signin = signin;
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
