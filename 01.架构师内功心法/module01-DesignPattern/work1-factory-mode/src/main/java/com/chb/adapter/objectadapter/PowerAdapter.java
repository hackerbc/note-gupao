package com.chb.adapter.objectadapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220();
        //变压器
        int output = adapterInput/44;
        System.out.println("使用"+PowerAdapter.class.getSimpleName()+
                "输入AC："+adapterInput+
        "V 输出DC："+output+"V");
        return output;
    }
}
