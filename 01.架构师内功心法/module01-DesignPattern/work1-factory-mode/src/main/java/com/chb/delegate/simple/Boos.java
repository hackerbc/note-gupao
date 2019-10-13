package com.chb.delegate.simple;

import com.chb.delegate.simple.Leader;

public class Boos {
    public void command(String command, Leader leader){
        leader.doing(command);
    }
}
