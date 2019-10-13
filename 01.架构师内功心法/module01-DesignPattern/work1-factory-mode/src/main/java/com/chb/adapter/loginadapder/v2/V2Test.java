package com.chb.adapter.loginadapder.v2;

public class V2Test {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }
}
