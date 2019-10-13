package com.chb.pattern.shallowclone;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone() {
        return (Prototype) prototype.clone();
    }
}
